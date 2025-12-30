# Guide Ultra-Précis : Android Studio Étape par Étape

## 📍 ÉTAPE 1 : OÙ SONT VOS FICHIERS ?

### Emplacement EXACT du projet :
```
/home/user/Test-Claude-code/
```

**C'est ce dossier que vous allez ouvrir dans Android Studio.**

---

## 🖥️ ÉTAPE 2 : OUVRIR ANDROID STUDIO

### 2.1 Lancer Android Studio

1. **Sur Linux :**
   ```bash
   # Si installé via snap
   android-studio

   # Ou depuis le menu Applications
   Applications → Programmation → Android Studio
   ```

2. **Sur Windows :**
   - Menu Démarrer → Android Studio

3. **Sur Mac :**
   - Applications → Android Studio

### 2.2 Écran de Bienvenue

Vous verrez cet écran :
```
┌─────────────────────────────────────────────┐
│  Welcome to Android Studio                  │
│                                              │
│  ┌────────────────────────────────────────┐ │
│  │ New Project                            │ │
│  ├────────────────────────────────────────┤ │
│  │ Open                          [bouton] │ │  ← CLIQUEZ ICI !
│  ├────────────────────────────────────────┤ │
│  │ Get from VCS                           │ │
│  └────────────────────────────────────────┘ │
│                                              │
│  Recent Projects:                            │
│  (vide si première utilisation)              │
└─────────────────────────────────────────────┘
```

**→ Cliquez sur "Open" (ou File → Open si déjà dans Android Studio)**

---

## 📂 ÉTAPE 3 : SÉLECTIONNER LE DOSSIER

### 3.1 Navigateur de Fichiers

Une fenêtre s'ouvre pour choisir un dossier :

```
┌────────────────────────────────────────────────┐
│  Open File or Project                          │
├────────────────────────────────────────────────┤
│  Chemin : /home/user/                          │
│                                                │
│  📁 Desktop                                    │
│  📁 Documents                                  │
│  📁 Downloads                                  │
│  📁 Test-Claude-code          ← SÉLECTIONNEZ ! │
│  📁 Pictures                                   │
│                                                │
│  [Cancel]                [OK]  ← PUIS CLIQUEZ !│
└────────────────────────────────────────────────┘
```

**IMPORTANT :**
1. Allez dans `/home/user/`
2. Cliquez UNE SEULE FOIS sur le dossier `Test-Claude-code`
3. Cliquez sur le bouton `OK` (ou `Open`)

**❌ NE PAS :**
- Double-cliquer pour entrer dans le dossier
- Sélectionner le dossier `app/` à l'intérieur
- Sélectionner un fichier individuel

**✅ SÉLECTIONNEZ JUSTE :**
```
Test-Claude-code/   ← Ce dossier entier
```

---

## ⏳ ÉTAPE 4 : ATTENDRE LA SYNCHRONISATION

### 4.1 Gradle Sync (PATIENCE !)

Dès que vous ouvrez le projet, vous verrez EN BAS :

```
┌─────────────────────────────────────────────────┐
│  Build  │  Logcat  │  Terminal  │  Problems     │
├─────────────────────────────────────────────────┤
│                                                  │
│  🔄 Gradle sync in progress...                  │
│  ████████████░░░░░░░░░░░░░░░░░ 45%              │
│                                                  │
│  Downloading dependencies...                    │
│  Resolving com.android.tools.build:gradle...    │
└─────────────────────────────────────────────────┘
```

**⏰ TEMPS D'ATTENTE :** 2 à 5 minutes (première fois)

**QUE SE PASSE-T-IL ?**
- Gradle télécharge les dépendances Android
- Le projet se configure automatiquement
- Ne touchez à rien pendant ce temps !

### 4.2 Fin de la Synchronisation

Quand c'est fini, vous verrez :
```
✅ Gradle sync finished in 3m 24s
```

---

## 👀 ÉTAPE 5 : CE QUE VOUS VERREZ DANS ANDROID STUDIO

### 5.1 Vue du Projet (Panneau de Gauche)

```
Android Studio
┌──────────────────────────────────────────────────────────────┐
│ File  Edit  View  Navigate  Code  Run  Tools  Help           │
├──────┬───────────────────────────────────────────────────────┤
│      │                                                        │
│ 📁   │  ▼ 📁 Test-Claude-code                                │
│ Proj │    ▼ 📁 app                                           │
│ ect  │      ▼ 📁 src                                         │
│      │        ▼ 📁 main                                      │
│      │          ▼ 📁 java                                    │
│      │            ▼ 📁 com.example.counterwidget             │
│      │              📄 CounterWidgetProvider.kt  ← CODE     │
│      │              📄 MainActivity.kt                       │
│      │          ▼ 📁 res                                     │
│      │            ▼ 📁 layout                                │
│      │              📄 counter_widget.xml                    │
│      │            ▼ 📁 values                                │
│      │              📄 colors.xml                            │
│      │              📄 strings.xml                           │
│      │          📄 AndroidManifest.xml                       │
│      │      📄 build.gradle                                  │
│      │    📄 build.gradle                                    │
├──────┴───────────────────────────────────────────────────────┤
│ EN HAUT À DROITE :                                            │
│  [app ▼]  [Pixel 6 API 33 ▼]  ▶️ Run  ⚙️                    │
│     ↑           ↑               ↑                             │
│   Module    Appareil       BOUTON PRINCIPAL                   │
└──────────────────────────────────────────────────────────────┘
```

**C'EST ICI QUE VOUS TRAVAILLEZ !**

---

## 🚫 ÉTAPE 6 : VOUS N'AVEZ RIEN À MODIFIER !

### Important : Le projet est DÉJÀ COMPLET

**❌ VOUS N'AVEZ PAS BESOIN DE :**
- Ouvrir les fichiers
- Modifier le code
- Créer de nouveaux fichiers
- Changer les configurations

**✅ TOUT EST DÉJÀ FAIT :**
- Le code du widget ✅
- Les layouts XML ✅
- Les ressources ✅
- La configuration Gradle ✅

---

## ▶️ ÉTAPE 7 : COMPILER ET INSTALLER (1 SEUL CLIC !)

### 7.1 Vérifier que Votre Téléphone est Détecté

**EN HAUT, au milieu de l'écran :**

```
┌────────────────────────────────────────────┐
│  [app ▼]  [Samsung Galaxy S21 ▼]  ▶️ Run │
│              ↑                             │
│         VOTRE TÉLÉPHONE                    │
└────────────────────────────────────────────┘
```

**Si vous voyez le nom de votre téléphone → PARFAIT !**

**Si vous voyez "No devices" :**
1. Vérifiez que le débogage USB est activé
2. Débranchez/rebranchez le câble USB
3. Autorisez le débogage USB sur le téléphone

### 7.2 Cliquer sur le Bouton Play

```
EN HAUT À DROITE, cliquez sur :  ▶️ Run
```

**C'EST TOUT !**

### 7.3 Ce qui va se Passer

1. **Compilation (1-3 minutes la première fois)**
   ```
   Build  │
   ─────────────────────────────────────
   > Task :app:compileDebugKotlin
   > Task :app:processDebugResources
   > Task :app:packageDebug

   BUILD SUCCESSFUL in 2m 15s
   ```

2. **Installation Automatique**
   ```
   Installing APK: app-debug.apk
   Success
   ```

3. **Lancement sur le Téléphone**
   - L'app "Compteur Widget" s'ouvre
   - Elle se ferme immédiatement
   - **C'EST NORMAL !** (pas d'interface, juste un widget)

---

## 📱 ÉTAPE 8 : AJOUTER LE WIDGET SUR LE TÉLÉPHONE

### Sur votre téléphone Android :

**1. Aller sur l'écran d'accueil**

**2. Appuyer LONGUEMENT (2-3 secondes) sur un espace vide**

**3. Un menu apparaît :**
```
┌─────────────────────┐
│   Widgets           │ ← APPUYEZ ICI
│   Fonds d'écran     │
│   Paramètres        │
└─────────────────────┘
```

**4. Chercher "Compteur Widget" dans la liste**

**5. Appuyer longuement sur le widget et le GLISSER vers l'écran d'accueil**

**6. Le widget apparaît !**
```
┌─────────────────────────┐
│      Compteur          │
│                         │
│          0             │
│                         │
│   [-]  [Reset]  [+]   │
└─────────────────────────┘
```

**7. TESTER :**
- Appuyez sur **+** → Le nombre devient 1, 2, 3...
- Appuyez sur **-** → Le nombre diminue
- Appuyez sur **Reset** → Retour à 0

---

## 🎯 RÉSUMÉ ULTRA-RAPIDE

### Checklist de ce que VOUS devez faire :

```
☐ 1. Ouvrir Android Studio
☐ 2. File → Open
☐ 3. Sélectionner : /home/user/Test-Claude-code/
☐ 4. Cliquer OK
☐ 5. ATTENDRE Gradle sync (2-5 min) ☕
☐ 6. Brancher le téléphone via USB
☐ 7. Autoriser le débogage USB sur le téléphone
☐ 8. Vérifier que le téléphone apparaît en haut
☐ 9. Cliquer sur ▶️ Run
☐ 10. ATTENDRE la compilation (1-3 min) ☕
☐ 11. Sur le téléphone : Écran d'accueil → Appui long → Widgets
☐ 12. Chercher "Compteur Widget"
☐ 13. Glisser-déposer le widget
☐ 14. Tester les boutons !
```

---

## 🔧 FICHIERS À CONNAÎTRE (si vous voulez personnaliser plus tard)

**Vous n'avez PAS besoin de les ouvrir maintenant, mais si vous voulez modifier quelque chose :**

| Fichier | Chemin dans Android Studio | À quoi ça sert |
|---------|----------------------------|----------------|
| **CounterWidgetProvider.kt** | `app/src/main/java/.../CounterWidgetProvider.kt` | Toute la logique du widget (compteur +, -, reset) |
| **counter_widget.xml** | `app/src/main/res/layout/counter_widget.xml` | L'apparence du widget (boutons, texte) |
| **colors.xml** | `app/src/main/res/values/colors.xml` | Les couleurs (bleu, fond, etc.) |
| **strings.xml** | `app/src/main/res/values/strings.xml` | Les textes ("+", "-", "Reset", "Compteur") |

**Pour modifier une couleur par exemple :**
1. Double-cliquez sur `colors.xml` dans le panneau de gauche
2. Changez une valeur hexadécimale
3. Cliquez sur ▶️ Run pour recompiler

---

## 🆘 PROBLÈMES FRÉQUENTS

### "Je ne trouve pas /home/user/Test-Claude-code/"

**Si vous êtes sur Linux :**
```bash
# Ouvrez un terminal et tapez :
cd /home/user/Test-Claude-code
pwd
# Ça doit afficher : /home/user/Test-Claude-code
```

**Si vous ne trouvez pas le dossier :**
- Vérifiez que vous avez bien cloné/téléchargé le projet
- Le dossier doit contenir les fichiers `build.gradle`, `settings.gradle`, etc.

### "Mon téléphone n'apparaît pas"

1. Débranchez et rebranchez le câble USB
2. Sur le téléphone, vérifiez qu'une notification "Débogage USB" apparaît
3. Essayez un autre câble USB (certains sont "charge only")
4. Dans le terminal d'Android Studio :
   ```bash
   adb devices
   # Doit afficher votre appareil
   ```

### "Gradle sync failed"

1. Vérifiez votre connexion Internet
2. File → Invalidate Caches → Invalidate and Restart
3. Redémarrez Android Studio

---

## ✅ TOUT EST PRÊT !

**Vous n'avez qu'à :**
1. Ouvrir `/home/user/Test-Claude-code/` dans Android Studio
2. Attendre Gradle
3. Cliquer sur ▶️
4. Ajouter le widget sur votre téléphone

**C'EST TOUT ! Bonne chance ! 🚀**
