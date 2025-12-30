package com.example.counterwidget

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews

class CounterWidgetProvider : AppWidgetProvider() {

    companion object {
        private const val ACTION_INCREMENT = "com.example.counterwidget.ACTION_INCREMENT"
        private const val ACTION_DECREMENT = "com.example.counterwidget.ACTION_DECREMENT"
        private const val ACTION_RESET = "com.example.counterwidget.ACTION_RESET"
        private const val PREFS_NAME = "CounterWidgetPrefs"
        private const val PREF_COUNTER_KEY = "counter_"

        fun updateAppWidget(
            context: Context,
            appWidgetManager: AppWidgetManager,
            appWidgetId: Int
        ) {
            val views = RemoteViews(context.packageName, R.layout.counter_widget)

            // Récupérer la valeur actuelle du compteur
            val counter = getCounterValue(context, appWidgetId)
            views.setTextViewText(R.id.counter_text, counter.toString())

            // Configurer les boutons avec des PendingIntents
            setButtonIntent(context, views, appWidgetId, ACTION_INCREMENT, R.id.increment_button)
            setButtonIntent(context, views, appWidgetId, ACTION_DECREMENT, R.id.decrement_button)
            setButtonIntent(context, views, appWidgetId, ACTION_RESET, R.id.reset_button)

            // Mettre à jour le widget
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }

        private fun setButtonIntent(
            context: Context,
            views: RemoteViews,
            appWidgetId: Int,
            action: String,
            buttonId: Int
        ) {
            val intent = Intent(context, CounterWidgetProvider::class.java).apply {
                this.action = action
                putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId)
            }
            val pendingIntent = PendingIntent.getBroadcast(
                context,
                appWidgetId * 10 + buttonId, // Unique request code
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )
            views.setOnClickPendingIntent(buttonId, pendingIntent)
        }

        private fun getCounterValue(context: Context, appWidgetId: Int): Int {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            return prefs.getInt(PREF_COUNTER_KEY + appWidgetId, 0)
        }

        private fun setCounterValue(context: Context, appWidgetId: Int, value: Int) {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            prefs.edit().putInt(PREF_COUNTER_KEY + appWidgetId, value).apply()
        }

        private fun incrementCounter(context: Context, appWidgetId: Int) {
            val currentValue = getCounterValue(context, appWidgetId)
            setCounterValue(context, appWidgetId, currentValue + 1)
        }

        private fun decrementCounter(context: Context, appWidgetId: Int) {
            val currentValue = getCounterValue(context, appWidgetId)
            setCounterValue(context, appWidgetId, currentValue - 1)
        }

        private fun resetCounter(context: Context, appWidgetId: Int) {
            setCounterValue(context, appWidgetId, 0)
        }
    }

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        // Mettre à jour tous les widgets
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onReceive(context: Context, intent: Intent) {
        super.onReceive(context, intent)

        val appWidgetId = intent.getIntExtra(
            AppWidgetManager.EXTRA_APPWIDGET_ID,
            AppWidgetManager.INVALID_APPWIDGET_ID
        )

        if (appWidgetId != AppWidgetManager.INVALID_APPWIDGET_ID) {
            when (intent.action) {
                ACTION_INCREMENT -> {
                    incrementCounter(context, appWidgetId)
                    updateWidget(context, appWidgetId)
                }
                ACTION_DECREMENT -> {
                    decrementCounter(context, appWidgetId)
                    updateWidget(context, appWidgetId)
                }
                ACTION_RESET -> {
                    resetCounter(context, appWidgetId)
                    updateWidget(context, appWidgetId)
                }
            }
        }
    }

    override fun onDeleted(context: Context, appWidgetIds: IntArray) {
        // Nettoyer les préférences quand un widget est supprimé
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = prefs.edit()
        for (appWidgetId in appWidgetIds) {
            editor.remove(PREF_COUNTER_KEY + appWidgetId)
        }
        editor.apply()
    }

    override fun onEnabled(context: Context) {
        // Premier widget créé
    }

    override fun onDisabled(context: Context) {
        // Dernier widget supprimé
    }

    private fun updateWidget(context: Context, appWidgetId: Int) {
        val appWidgetManager = AppWidgetManager.getInstance(context)
        updateAppWidget(context, appWidgetManager, appWidgetId)
    }
}
