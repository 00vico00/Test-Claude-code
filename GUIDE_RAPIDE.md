# Guide Rapide - Widget Compteur

## 🚀 Installation en 5 Minutes

### 1️⃣ Ouvrir le Projet
```
Android Studio → File → Open → Sélectionner "Test-Claude-code/"
```

### 2️⃣ Préparer le Téléphone
```
Paramètres → À propos du téléphone → Taper 7× sur "Numéro de build"
Paramètres → Options développeur → Activer "Débogage USB"
```

### 3️⃣ Connecter et Lancer
```
Brancher le téléphone via USB
Dans Android Studio : Cliquer sur ▶️ (Run)
```

### 4️⃣ Ajouter le Widget
```
Écran d'accueil → Appui long → Widgets → "Compteur Widget" → Glisser-déposer
```

---

## 📱 Interface du Widget

```
┌─────────────────────────┐
│      Compteur          │
│                         │
│          42            │  ← Valeur actuelle
│                         │
│   [-]  [Reset]  [+]   │  ← Boutons
└─────────────────────────┘
```

- **Bouton +** : Incrémente de 1
- **Bouton -** : Décrémente de 1
- **Reset** : Remet à zéro

---

## 🔧 Dépannage Express

| Problème | Solution Rapide |
|----------|----------------|
| Widget invisible | Redémarrer le téléphone |
| Boutons ne répondent pas | Supprimer et rajouter le widget |
| Appareil non détecté | Essayer un autre câble USB |
| Erreur Gradle | `File` → `Invalidate Caches` → Restart |

---

## 📂 Fichiers Importants

| Fichier | Description |
|---------|-------------|
| `app/src/main/java/.../CounterWidgetProvider.kt` | Logique principale |
| `app/src/main/res/layout/counter_widget.xml` | Interface visuelle |
| `app/src/main/AndroidManifest.xml` | Configuration de l'app |
| `app/build.gradle` | Dépendances et versions |

---

## ✨ Fonctionnalités

- ✅ Compteur incrémental/décrémental
- ✅ Bouton reset
- ✅ Persistance des données (survit au redémarrage)
- ✅ Support multi-widgets (chaque widget est indépendant)
- ✅ Nettoyage automatique à la suppression
- ✅ Interface moderne avec coins arrondis

---

## 💡 Personnalisation Rapide

### Changer les Couleurs
```xml
<!-- app/src/main/res/values/colors.xml -->
<color name="counter_text">#2196F3</color>  ← Couleur du chiffre
<color name="widget_background">#F0F0F0</color>  ← Fond du widget
```

### Changer le Texte
```xml
<!-- app/src/main/res/values/strings.xml -->
<string name="widget_name">Compteur</string>
<string name="increment">+</string>
<string name="decrement">-</string>
<string name="reset">Reset</string>
```

### Changer la Taille du Texte
```xml
<!-- app/src/main/res/layout/counter_widget.xml -->
<TextView
    android:id="@+id/counter_text"
    android:textSize="48sp"  ← Augmentez ou diminuez cette valeur
    ... />
```

---

## 🎯 Checklist Avant de Tester

- [ ] Android Studio installé
- [ ] SDK Android 26+ téléchargé
- [ ] Mode développeur activé sur le téléphone
- [ ] Débogage USB activé
- [ ] Téléphone branché et autorisé
- [ ] Projet ouvert dans Android Studio
- [ ] Gradle synchronisé (aucune erreur)
- [ ] Appareil visible dans la barre d'outils

**Tout est vert ? Cliquez sur ▶️ !**

---

## 📞 Support

Pour des problèmes spécifiques, consultez la section "Étape 7 : Dépannage" dans le README.md principal.

**Bon test ! 🎉**
