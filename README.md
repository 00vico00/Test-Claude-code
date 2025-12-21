# Widget Compteur Android

Une application Android simple avec un widget de compteur pour l'écran d'accueil.

## Fonctionnalités

- **Widget interactif** : Affichez un compteur directement sur votre écran d'accueil
- **Bouton +** : Incrémente le compteur de 1
- **Bouton -** : Décrémente le compteur de 1
- **Bouton Reset** : Réinitialise le compteur à 0
- **Persistance** : La valeur du compteur est sauvegardée même après redémarrage

## Structure du Projet

```
CounterWidget/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/counterwidget/
│   │   │   ├── CounterWidgetProvider.kt    # Logique principale du widget
│   │   │   └── MainActivity.kt              # Activité principale (minimale)
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── counter_widget.xml       # Layout du widget
│   │   │   ├── drawable/
│   │   │   │   ├── widget_background.xml    # Fond arrondi du widget
│   │   │   │   └── ic_launcher_foreground.xml
│   │   │   ├── xml/
│   │   │   │   └── counter_widget_info.xml  # Configuration du widget
│   │   │   └── values/
│   │   │       ├── strings.xml              # Textes de l'app
│   │   │       ├── colors.xml               # Couleurs
│   │   │       └── themes.xml               # Thèmes
│   │   └── AndroidManifest.xml              # Manifeste de l'application
│   └── build.gradle                         # Configuration Gradle du module
├── build.gradle                             # Configuration Gradle racine
├── settings.gradle                          # Paramètres Gradle
└── gradle.properties                        # Propriétés Gradle
```

## Comment Compiler

### Prérequis
- Android Studio (Arctic Fox ou plus récent recommandé)
- JDK 8 ou supérieur
- Android SDK avec API Level 26+ (Android 8.0 Oreo minimum)

### Étapes de Compilation

1. **Ouvrir le projet**
   ```bash
   # Cloner ou ouvrir le projet dans Android Studio
   # File > Open > Sélectionner le dossier du projet
   ```

2. **Synchroniser Gradle**
   - Android Studio va automatiquement synchroniser les dépendances
   - Ou manuellement : File > Sync Project with Gradle Files

3. **Compiler l'APK**
   ```bash
   # Via ligne de commande (depuis le dossier racine du projet)
   ./gradlew assembleDebug

   # L'APK sera généré dans : app/build/outputs/apk/debug/app-debug.apk
   ```

4. **Installer sur un appareil**
   ```bash
   # Via ligne de commande
   ./gradlew installDebug

   # Ou via Android Studio
   # Run > Run 'app' (Shift+F10)
   ```

## Comment Utiliser

1. **Installation**
   - Installez l'APK sur votre appareil Android
   - Vous pouvez fermer l'app immédiatement (elle n'a pas d'interface principale)

2. **Ajouter le Widget**
   - Appuyez longuement sur l'écran d'accueil
   - Sélectionnez "Widgets"
   - Trouvez "Compteur Widget" dans la liste
   - Glissez-déposez le widget sur l'écran d'accueil

3. **Utiliser le Compteur**
   - Appuyez sur **+** pour incrémenter
   - Appuyez sur **-** pour décrémenter
   - Appuyez sur **Reset** pour remettre à zéro

## Détails Techniques

### Stockage des Données
- Les valeurs du compteur sont stockées dans `SharedPreferences`
- Chaque instance de widget a son propre compteur indépendant
- Les données persistent après redémarrage de l'appareil
- Les préférences sont automatiquement nettoyées quand un widget est supprimé

### Architecture
- **CounterWidgetProvider** : Hérite de `AppWidgetProvider`
  - Gère les événements du widget (création, mise à jour, suppression)
  - Traite les clics sur les boutons via `PendingIntent`
  - Utilise `RemoteViews` pour mettre à jour l'interface

### Compatibilité
- **Minimum SDK** : 26 (Android 8.0 Oreo)
- **Target SDK** : 34 (Android 14)
- **Kotlin** : 1.9.0
- **Gradle** : 8.1.0

## Personnalisation

Vous pouvez facilement personnaliser le widget :

- **Couleurs** : Modifiez `app/src/main/res/values/colors.xml`
- **Tailles** : Ajustez `counter_widget.xml` pour les dimensions
- **Design** : Personnalisez `widget_background.xml` pour le fond
- **Textes** : Modifiez `strings.xml` pour changer les labels

## Licence

Ce projet est un exemple éducatif libre d'utilisation