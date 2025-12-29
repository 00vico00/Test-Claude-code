# 🪟 GUIDE COMPLET POUR WINDOWS

## ⚠️ IMPORTANT : Les Fichiers Sont sur GitHub !

Les fichiers que j'ai créés sont sur **GitHub**, pas sur votre PC Windows.
Vous devez d'abord les **télécharger** depuis GitHub.

---

## 📍 ÉTAPE 1 : RÉCUPÉRER LE PROJET DEPUIS GITHUB

### Option A : Via Git (Recommandé si vous avez Git)

#### 1.1 Vérifier si Git est Installé

Ouvrez **PowerShell** ou **Command Prompt** (cmd) et tapez :
```cmd
git --version
```

**Si vous voyez :** `git version 2.x.x` → Git est installé ✅

**Si vous voyez :** `'git' n'est pas reconnu...` → Installez Git :
- Allez sur : https://git-scm.com/download/win
- Téléchargez et installez Git pour Windows
- Redémarrez votre terminal

#### 1.2 Cloner le Projet

```cmd
# Ouvrez PowerShell ou cmd
# Allez dans un dossier où vous voulez mettre le projet (par exemple Documents)
cd C:\Users\VotreNom\Documents

# Clonez le dépôt GitHub
git clone https://github.com/00vico00/Test-Claude-code.git

# Entrez dans le dossier
cd Test-Claude-code
```

**Résultat :** Le projet sera dans :
```
C:\Users\VotreNom\Documents\Test-Claude-code\
```

### Option B : Télécharger le ZIP (Sans Git)

#### 1.1 Télécharger depuis GitHub

1. Allez sur : **https://github.com/00vico00/Test-Claude-code**
2. Cliquez sur le bouton vert **"Code"**
3. Cliquez sur **"Download ZIP"**
4. Enregistrez le fichier `Test-Claude-code-main.zip`

#### 1.2 Extraire le ZIP

1. Allez dans votre dossier **Téléchargements** (Downloads)
2. **Clic droit** sur `Test-Claude-code-main.zip`
3. Cliquez sur **"Extraire tout..."**
4. Choisissez un emplacement (par exemple : `C:\Users\VotreNom\Documents\`)
5. Cliquez sur **"Extraire"**

**Résultat :** Le projet sera dans :
```
C:\Users\VotreNom\Documents\Test-Claude-code-main\
```

**⚠️ IMPORTANT :** Notez bien l'emplacement exact, vous en aurez besoin !

---

## 📍 ÉTAPE 2 : INSTALLER ANDROID STUDIO SUR WINDOWS

### 2.1 Télécharger Android Studio

1. Allez sur : https://developer.android.com/studio
2. Cliquez sur **"Download Android Studio"**
3. Acceptez les conditions
4. Téléchargez le fichier `.exe` (environ 1 Go)

### 2.2 Installer Android Studio

1. **Double-cliquez** sur le fichier `.exe` téléchargé
2. Cliquez sur **"Next"** dans l'assistant d'installation
3. **Laissez toutes les options cochées par défaut**
4. Choisissez l'emplacement d'installation (ou laissez par défaut)
5. Cliquez sur **"Install"**
6. Attendez la fin de l'installation (5-10 minutes)
7. Cliquez sur **"Finish"**

### 2.3 Premier Lancement

1. Android Studio se lance automatiquement
2. **Si une fenêtre "Import Settings" apparaît :**
   - Choisissez **"Do not import settings"**
   - Cliquez sur **"OK"**

3. **Assistant de Configuration :**
   - Écran de bienvenue → Cliquez sur **"Next"**
   - Type d'installation → Choisissez **"Standard"** → **"Next"**
   - Thème → Choisissez celui que vous voulez → **"Next"**
   - Vérification des paramètres → **"Next"**
   - **Téléchargement du SDK Android** (10-30 minutes) ⏰
   - Attendez que tout se télécharge
   - Cliquez sur **"Finish"**

**Vous arrivez sur l'écran de bienvenue d'Android Studio.**

---

## 📂 ÉTAPE 3 : OUVRIR LE PROJET DANS ANDROID STUDIO

### 3.1 Sur l'Écran de Bienvenue

```
┌─────────────────────────────────────────────┐
│  Welcome to Android Studio                  │
│                                              │
│  ┌────────────────────────────────────────┐ │
│  │ New Project                            │ │
│  ├────────────────────────────────────────┤ │
│  │ Open                          [bouton] │ │  ← CLIQUEZ ICI !
│  └────────────────────────────────────────┘ │
└─────────────────────────────────────────────┘
```

Cliquez sur **"Open"**

### 3.2 Naviguer vers le Projet

Une fenêtre de navigation s'ouvre.

**Allez vers l'emplacement où vous avez extrait/cloné le projet :**

**Si vous avez cloné avec Git :**
```
C:\Users\VotreNom\Documents\Test-Claude-code\
```

**Si vous avez téléchargé le ZIP :**
```
C:\Users\VotreNom\Documents\Test-Claude-code-main\
```

**OU** partout où vous avez mis le projet.

### 3.3 Sélectionner le Dossier du Projet

**TRÈS IMPORTANT :**

1. **Cliquez UNE SEULE FOIS** sur le dossier `Test-Claude-code` (ou `Test-Claude-code-main`)
2. Le dossier doit être **surligné en bleu**
3. Cliquez sur **"OK"**

**❌ NE PAS :**
- Double-cliquer pour entrer dans le dossier
- Sélectionner le dossier `app\` à l'intérieur
- Sélectionner un fichier

**✅ SÉLECTIONNEZ :**
```
Test-Claude-code\    ← Ce dossier complet
```

---

## ⏳ ÉTAPE 4 : ATTENDRE GRADLE SYNC

### 4.1 Gradle Se Synchronise Automatiquement

Dès que le projet s'ouvre, **EN BAS de l'écran**, vous verrez :

```
Build   Logcat   Terminal   Problems
─────────────────────────────────────
🔄 Gradle sync in progress...
████████████░░░░░░░░░░░░░ 45%

Downloading dependencies...
```

**⏰ TEMPS D'ATTENTE :** 2 à 10 minutes (première fois sur Windows)

**NE TOUCHEZ À RIEN !** Laissez Gradle travailler.

### 4.2 Fin de la Synchronisation

Quand c'est terminé, vous verrez :
```
✅ Gradle sync finished in 5m 12s
```

**Si vous voyez des erreurs, regardez la section Dépannage plus bas.**

---

## 📱 ÉTAPE 5 : PRÉPARER VOTRE TÉLÉPHONE ANDROID

### 5.1 Activer le Mode Développeur

**Sur votre téléphone Android :**

1. Allez dans **Paramètres**
2. **À propos du téléphone** (ou **Système → À propos du téléphone**)
3. Tapez **7 fois rapidement** sur **"Numéro de build"**
4. Un message apparaît : **"Vous êtes développeur !"**

### 5.2 Activer le Débogage USB

1. Retournez dans **Paramètres**
2. Allez dans **Options de développeur** (ou **Système → Options de développeur**)
3. **Activez** le bouton **"Options de développeur"** (en haut)
4. **Activez** **"Débogage USB"**
5. Si disponible, activez aussi **"Installation via USB"**

### 5.3 Connecter le Téléphone au PC

1. **Branchez** votre téléphone via **câble USB** à votre PC Windows
2. **Sur le téléphone**, une popup apparaît :
   ```
   Autoriser le débogage USB ?
   ```
3. **Cochez** "Toujours autoriser depuis cet ordinateur"
4. Appuyez sur **"OK"**

### 5.4 Vérifier la Connexion dans Android Studio

**EN HAUT de Android Studio**, à côté du bouton ▶️ Run :

```
┌────────────────────────────────────────────┐
│  [app ▼]  [Samsung Galaxy S21 ▼]  ▶️ Run │
│              ↑                             │
│         Votre téléphone                    │
└────────────────────────────────────────────┘
```

**Si vous voyez le nom de votre téléphone → PARFAIT ! ✅**

**Si vous voyez "No devices" :**
- Débranchez et rebranchez le câble USB
- Essayez un autre port USB
- Vérifiez que le débogage USB est bien activé
- **Sur Windows, vous devrez peut-être installer les drivers USB** (voir section Dépannage)

---

## ▶️ ÉTAPE 6 : COMPILER ET INSTALLER (1 CLIC !)

### 6.1 Cliquer sur Run

**EN HAUT À DROITE de Android Studio :**

```
Cliquez sur :  ▶️ Run
```

**C'EST TOUT !**

### 6.2 Ce qui va Se Passer

1. **Compilation (1-5 minutes la première fois)**
   ```
   Build
   ─────────────────────────────────────
   > Task :app:compileDebugKotlin
   > Task :app:processDebugResources
   > Task :app:packageDebug

   BUILD SUCCESSFUL in 3m 45s
   ```

2. **Installation Automatique**
   ```
   Installing APK: app-debug.apk
   Success
   ```

3. **Lancement sur le Téléphone**
   - L'app "Compteur Widget" s'ouvre
   - Elle se ferme immédiatement
   - **C'EST NORMAL !** L'app n'a pas d'interface

---

## 🎯 ÉTAPE 7 : AJOUTER LE WIDGET SUR LE TÉLÉPHONE

### Sur Votre Téléphone Android :

1. **Allez sur l'écran d'accueil**

2. **Appuyez LONGUEMENT** (2-3 secondes) sur un espace vide

3. **Un menu apparaît** → Appuyez sur **"Widgets"**

4. **Cherchez "Compteur Widget"** dans la liste

5. **Appuyez longuement** sur le widget et **glissez-le** vers l'écran d'accueil

6. **Le widget apparaît !**
   ```
   ┌─────────────────────────┐
   │      Compteur          │
   │                         │
   │          0             │
   │                         │
   │   [-]  [Reset]  [+]   │
   └─────────────────────────┘
   ```

7. **TESTEZ :**
   - **+** → Le nombre augmente
   - **-** → Le nombre diminue
   - **Reset** → Retour à 0

**ÇA MARCHE ! 🎉**

---

## 🛠️ DÉPANNAGE WINDOWS

### Problème : "SDK location not found"

**Solution :**
1. Dans Android Studio : **File → Project Structure**
2. À gauche : **SDK Location**
3. Vérifiez que **Android SDK location** est rempli
4. Si vide, cliquez sur **...** et sélectionnez :
   ```
   C:\Users\VotreNom\AppData\Local\Android\Sdk
   ```
5. Cliquez sur **Apply** puis **OK**
6. **File → Sync Project with Gradle Files**

### Problème : Téléphone Non Détecté (Windows)

**Solution : Installer les Drivers USB**

**Pour Samsung :**
1. Téléchargez : https://developer.samsung.com/android-usb-driver
2. Installez le driver
3. Redémarrez votre PC
4. Rebranchez le téléphone

**Pour Google Pixel :**
1. Téléchargez : https://developer.android.com/studio/run/win-usb
2. Installez le driver
3. Redémarrez votre PC

**Pour autres marques :**
- Recherchez "USB Driver [Marque] Windows" sur Google
- Téléchargez depuis le site officiel du fabricant

**Vérifier avec adb :**
```cmd
# Dans PowerShell ou cmd
cd C:\Users\VotreNom\AppData\Local\Android\Sdk\platform-tools
adb devices
```

Devrait afficher :
```
List of devices attached
abc123456    device
```

### Problème : "Gradle sync failed"

**Solution :**
1. Vérifiez votre connexion Internet
2. **File → Invalidate Caches → Invalidate and Restart**
3. Attendez que Android Studio redémarre
4. **File → Sync Project with Gradle Files**

### Problème : Antivirus Bloque la Compilation

**Solution :**
- Ajoutez une exception dans votre antivirus pour :
  ```
  C:\Users\VotreNom\AppData\Local\Android\
  C:\Users\VotreNom\.gradle\
  Le dossier de votre projet
  ```

---

## 📋 CHECKLIST WINDOWS COMPLÈTE

```
☐ 1. Aller sur https://github.com/00vico00/Test-Claude-code
☐ 2. Télécharger le ZIP ou cloner avec Git
☐ 3. Extraire dans C:\Users\VotreNom\Documents\
☐ 4. Télécharger Android Studio depuis developer.android.com
☐ 5. Installer Android Studio (10-30 min)
☐ 6. Premier lancement → Configuration Standard
☐ 7. Android Studio → Open → Sélectionner Test-Claude-code\
☐ 8. Attendre Gradle sync (2-10 min) ☕
☐ 9. Activer mode développeur sur le téléphone (taper 7× sur "Numéro de build")
☐ 10. Activer débogage USB dans Options développeur
☐ 11. Brancher le téléphone via USB
☐ 12. Autoriser le débogage USB sur le téléphone
☐ 13. Vérifier que le téléphone apparaît en haut dans Android Studio
☐ 14. (Si nécessaire) Installer les drivers USB pour votre marque de téléphone
☐ 15. Cliquer sur ▶️ Run
☐ 16. Attendre la compilation (1-5 min) ☕
☐ 17. Sur le téléphone : Écran d'accueil → Appui long → Widgets
☐ 18. Chercher "Compteur Widget"
☐ 19. Glisser-déposer le widget
☐ 20. Tester + - Reset !
```

**Temps total estimé : 30-60 minutes (première fois)**

---

## 🔗 LIENS UTILES

- **GitHub du projet :** https://github.com/00vico00/Test-Claude-code
- **Android Studio :** https://developer.android.com/studio
- **Git pour Windows :** https://git-scm.com/download/win
- **Samsung USB Driver :** https://developer.samsung.com/android-usb-driver
- **Google USB Driver :** https://developer.android.com/studio/run/win-usb

---

## 📂 CHEMINS WINDOWS IMPORTANTS

```
Projet (après téléchargement) :
C:\Users\VotreNom\Documents\Test-Claude-code\

Android SDK :
C:\Users\VotreNom\AppData\Local\Android\Sdk\

Android Studio :
C:\Program Files\Android\Android Studio\

ADB (pour debug) :
C:\Users\VotreNom\AppData\Local\Android\Sdk\platform-tools\adb.exe
```

---

**Vous êtes prêt ! Bon développement sur Windows ! 🪟🚀**
