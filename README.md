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

## Guide Complet : De l'Installation au Test

### Étape 1 : Localiser les Fichiers du Projet

Tous vos fichiers sont déjà dans le dossier `Test-Claude-code/` :

```
Test-Claude-code/                    ← Racine du projet (OUVREZ CE DOSSIER)
├── .git/                            ← Dépôt Git
├── .gitignore                       ← Fichiers ignorés par Git
├── README.md                        ← Ce fichier
├── build.gradle                     ← Config Gradle principale
├── settings.gradle                  ← Paramètres Gradle
├── gradle.properties                ← Propriétés Gradle
└── app/                             ← Module Android
    ├── build.gradle                 ← Config du module app
    ├── proguard-rules.pro           ← Règles de minification
    └── src/main/
        ├── AndroidManifest.xml      ← Manifeste Android
        ├── java/com/example/counterwidget/
        │   ├── CounterWidgetProvider.kt  ← CODE PRINCIPAL DU WIDGET
        │   └── MainActivity.kt           ← Activité de lancement
        └── res/
            ├── layout/
            │   └── counter_widget.xml    ← Interface du widget
            ├── drawable/
            │   ├── widget_background.xml
            │   └── ic_launcher_foreground.xml
            ├── xml/
            │   └── counter_widget_info.xml
            ├── values/
            │   ├── strings.xml
            │   ├── colors.xml
            │   └── themes.xml
            └── mipmap-hdpi/
                └── ic_launcher.xml
```

### Étape 2 : Installer Android Studio

1. **Télécharger Android Studio**
   - Allez sur : https://developer.android.com/studio
   - Téléchargez la dernière version pour votre OS
   - Version recommandée : Giraffe (2023) ou plus récent

2. **Installer Android Studio**
   - **Windows** : Exécutez le fichier `.exe` et suivez l'assistant
   - **Mac** : Ouvrez le `.dmg` et glissez vers Applications
   - **Linux** : Extrayez l'archive et exécutez `studio.sh`

3. **Premier Lancement** (Important !)
   - Choisissez "Standard" lors de la configuration initiale
   - Laissez télécharger le SDK Android (peut prendre 10-30 minutes)
   - Vérifiez que le SDK Android 34 est installé

### Étape 3 : Ouvrir le Projet dans Android Studio

1. **Lancer Android Studio**

2. **Ouvrir le projet**
   - Cliquez sur `File` → `Open...`
   - Naviguez vers le dossier `Test-Claude-code/`
   - **IMPORTANT** : Sélectionnez le dossier racine (celui qui contient `build.gradle`)
   - Cliquez sur `OK`

3. **Première ouverture** (Patience requise !)
   - Android Studio va automatiquement détecter le projet Gradle
   - Une synchronisation Gradle va démarrer (barre en bas)
   - Attendez que "Gradle sync finished" apparaisse (2-5 minutes)
   - Si erreur : cliquez sur `File` → `Sync Project with Gradle Files`

4. **Vérifications**
   - Dans le panneau de gauche (Project), vous devriez voir :
     - `app` → `src` → `main` → `java` → `counterwidget`
   - En bas, vérifiez qu'il n'y a pas d'erreurs dans l'onglet `Build`

### Étape 4 : Préparer votre Appareil Android

#### Option A : Utiliser un Appareil Physique (RECOMMANDÉ pour les widgets)

1. **Activer le Mode Développeur sur votre téléphone**
   - Allez dans `Paramètres` → `À propos du téléphone`
   - Tapez 7 fois sur `Numéro de build` (ou `Version MIUI` sur Xiaomi)
   - Un message "Vous êtes développeur" apparaît

2. **Activer le Débogage USB**
   - Retournez dans `Paramètres` → `Options de développeur`
   - Activez `Débogage USB`
   - Activez aussi `Installation via USB` (si disponible)

3. **Connecter votre téléphone**
   - Branchez votre téléphone via USB à votre ordinateur
   - Sur le téléphone, une popup "Autoriser le débogage USB ?" apparaît
   - Cochez "Toujours autoriser" et appuyez sur `OK`

4. **Vérifier la connexion dans Android Studio**
   - En haut, à côté du bouton ▶️ (Run)
   - Vous devriez voir le nom de votre appareil (ex: "Samsung Galaxy S21")
   - Si vous ne le voyez pas :
     - Débranchez/rebranchez le câble
     - Vérifiez que le débogage USB est activé
     - Essayez un autre câble USB (certains sont "charge only")

#### Option B : Utiliser un Émulateur (Alternative)

1. **Créer un émulateur**
   - Dans Android Studio : `Tools` → `Device Manager`
   - Cliquez sur `Create Device`
   - Sélectionnez un appareil (ex: Pixel 6)
   - Choisissez une image système : **Android 13 (API 33)** ou supérieur
   - Téléchargez l'image si nécessaire (2-3 Go, peut prendre 15-30 min)
   - Cliquez sur `Finish`

2. **Lancer l'émulateur**
   - Dans Device Manager, cliquez sur ▶️ à côté de votre émulateur
   - Attendez qu'il démarre (1-2 minutes la première fois)

### Étape 5 : Compiler et Installer l'Application

#### Méthode 1 : Via Android Studio (Le Plus Simple)

1. **Compiler et installer en un clic**
   - En haut à droite, cliquez sur le bouton ▶️ vert (`Run 'app'`)
   - Ou utilisez le raccourci : `Shift + F10` (Windows/Linux) ou `Ctrl + R` (Mac)

2. **Que se passe-t-il ?**
   - Android Studio compile le code Kotlin
   - Crée un fichier APK
   - Installe automatiquement l'APK sur votre appareil
   - Lance l'application

3. **Temps d'attente**
   - Première compilation : 1-3 minutes
   - Compilations suivantes : 10-30 secondes

4. **Résultat**
   - Sur votre téléphone, l'app "Compteur Widget" s'ouvre puis se ferme immédiatement
   - **C'est normal !** L'app n'a pas d'interface, c'est juste un widget

#### Méthode 2 : Via Ligne de Commande

1. **Ouvrir un terminal**
   - Dans Android Studio : `View` → `Tool Windows` → `Terminal`
   - Ou utilisez votre terminal système

2. **Naviguer vers le projet**
   ```bash
   cd /chemin/vers/Test-Claude-code
   ```

3. **Compiler l'APK**
   ```bash
   # Sur Linux/Mac
   ./gradlew assembleDebug

   # Sur Windows
   gradlew.bat assembleDebug
   ```

4. **Trouver l'APK généré**
   - Chemin : `app/build/outputs/apk/debug/app-debug.apk`
   - Vous pouvez copier ce fichier sur votre téléphone

5. **Installer l'APK**
   ```bash
   # Avec appareil connecté via USB
   ./gradlew installDebug

   # Ou utilisez adb directement
   adb install app/build/outputs/apk/debug/app-debug.apk
   ```

### Étape 6 : Ajouter et Tester le Widget

1. **Vérifier l'installation**
   - Sur votre téléphone, allez dans le tiroir d'applications
   - Vous devriez voir l'icône "Compteur Widget"
   - L'app s'ouvre puis se ferme immédiatement → **C'est normal !**

2. **Ajouter le Widget à l'écran d'accueil**

   **Sur la plupart des téléphones Android :**
   - Allez sur votre écran d'accueil
   - Appuyez **longuement** sur un espace vide (2-3 secondes)
   - Un menu apparaît avec "Widgets", "Fonds d'écran", etc.
   - Appuyez sur **"Widgets"**
   - Faites défiler jusqu'à trouver **"Compteur Widget"** ou **"Compteur"**
   - Appuyez longuement sur le widget et **glissez-le** vers l'écran d'accueil
   - Relâchez à l'endroit souhaité

   **Sur Samsung :**
   - Écran d'accueil → Appui long → "Widgets"
   - Cherchez "Compteur Widget"
   - Glissez-déposez

   **Sur Xiaomi (MIUI) :**
   - Écran d'accueil → Pincez l'écran (deux doigts)
   - "Widgets" en bas
   - Cherchez "Compteur Widget"

3. **Utiliser le Widget**

   Une fois le widget ajouté, vous verrez :
   - **Un titre** : "Compteur"
   - **Le nombre actuel** : Affiché en grand (commence à 0)
   - **Trois boutons** :
     - **-** (gauche) : Diminue le compteur de 1
     - **Reset** (centre) : Remet le compteur à 0
     - **+** (droite) : Augmente le compteur de 1

4. **Test complet**

   Testez toutes les fonctionnalités :
   ```
   ✅ Appuyez sur + plusieurs fois → Le nombre augmente
   ✅ Appuyez sur - plusieurs fois → Le nombre diminue
   ✅ Appuyez sur Reset → Retour à 0
   ✅ Redémarrez votre téléphone → Le compteur garde sa valeur
   ✅ Ajoutez plusieurs widgets → Chacun a son propre compteur
   ```

5. **Supprimer le widget**
   - Appuyez longuement sur le widget
   - Glissez vers "Supprimer" ou l'icône 🗑️
   - Les données de ce widget seront automatiquement effacées

### Étape 7 : Dépannage

#### Problème : Le widget n'apparaît pas dans la liste

**Solutions :**
- Vérifiez que l'app est bien installée (icône dans le tiroir d'apps)
- Redémarrez votre téléphone
- Désinstallez puis réinstallez l'app
- Vérifiez que votre Android est version 8.0 (Oreo) ou supérieur

#### Problème : Les boutons ne répondent pas

**Solutions :**
- Supprimez le widget et rajoutez-le
- Forcez l'arrêt de l'app : `Paramètres` → `Applications` → `Compteur Widget` → `Forcer l'arrêt`
- Réinstallez l'application

#### Problème : Erreur de compilation dans Android Studio

**"SDK location not found"**
```bash
# Créez un fichier local.properties à la racine du projet
echo "sdk.dir=/chemin/vers/votre/Android/Sdk" > local.properties

# Chemins typiques :
# Windows : C:\Users\VotreNom\AppData\Local\Android\Sdk
# Mac : /Users/VotreNom/Library/Android/sdk
# Linux : /home/VotreNom/Android/Sdk
```

**"Gradle sync failed"**
- Vérifiez votre connexion Internet
- `File` → `Invalidate Caches` → `Invalidate and Restart`
- Supprimez le dossier `.gradle` et resynchronisez

**"Unsupported class file major version"**
- Vérifiez votre version de JDK : `File` → `Project Structure` → `SDK Location`
- Utilisez JDK 11 ou 17

#### Problème : L'appareil n'est pas détecté par Android Studio

**Solutions :**
1. **Vérifier adb**
   ```bash
   # Dans le terminal d'Android Studio
   adb devices
   # Devrait afficher votre appareil
   ```

2. **Si aucun appareil n'apparaît :**
   - Débranchez et rebranchez le câble USB
   - Essayez un autre port USB
   - Essayez un autre câble (certains ne sont que pour la charge)
   - Désactivez puis réactivez le débogage USB

3. **Redémarrer adb**
   ```bash
   adb kill-server
   adb start-server
   adb devices
   ```

4. **Sur Windows : Installer les drivers USB**
   - Téléchargez les drivers USB de votre fabricant
   - Samsung : Samsung USB Driver for Mobile Phones
   - Google Pixel : Google USB Driver

#### Problème : "Installation failed" lors du déploiement

**Solutions :**
- Désinstallez manuellement l'ancienne version sur le téléphone
- Vérifiez que l'appareil a assez d'espace de stockage
- Activez "Installation via USB" dans les options développeur
- Essayez : `adb uninstall com.example.counterwidget` puis réinstallez

### Résumé Rapide (Checklist)

Pour tester rapidement :

```
☐ 1. Installer Android Studio
☐ 2. Ouvrir le dossier Test-Claude-code/
☐ 3. Attendre la synchro Gradle (2-5 min)
☐ 4. Activer le mode développeur sur le téléphone
☐ 5. Activer le débogage USB
☐ 6. Brancher le téléphone via USB
☐ 7. Autoriser le débogage USB sur le téléphone
☐ 8. Cliquer sur ▶️ dans Android Studio
☐ 9. Attendre la compilation (1-3 min)
☐ 10. Sur le téléphone : écran d'accueil → appui long → Widgets
☐ 11. Chercher "Compteur Widget"
☐ 12. Glisser-déposer le widget
☐ 13. Tester les boutons +, -, Reset
```

Temps total estimé : **15-30 minutes** (première fois)

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