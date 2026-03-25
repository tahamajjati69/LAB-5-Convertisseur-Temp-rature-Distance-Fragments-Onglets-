# Android Java – Convertisseur Température & Distance (Tabs)

## 📖 Description
Ce projet Android Java illustre l’utilisation de **ViewPager2** et **TabLayout** pour créer une application multi-onglets.  
L’application permet de convertir :
- **Températures** : Celsius ↔ Fahrenheit.  
- **Distances** : Kilomètres ↔ Miles.  

Chaque fonctionnalité est implémentée dans un **Fragment** distinct, accessible via des onglets.

---

## 📂 Structure du projet
```
app/
└── src/
└── main/
├── java/com/example/convertertabsjava/
│   ├── MainActivity.java
│   ├── TempFragment.java
│   ├── DistanceFragment.java
│   └── ViewPagerAdapter.java
└── res/
    └── layout/
        ├── activity_main.xml
        ├── fragment_temp.xml
        └── fragment_distance.xml
```
---
## 📲 Installation de l’APK

Pour installer l’APK de ce projet Android :

1. **Compiler l’application**  
   - Ouvrir le projet dans **Android Studio**.  
   - Aller dans le menu **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
   - <img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/f8013d07-8ca0-44f1-ba68-70147e031e22" />
   - Le fichier APK sera généré dans le dossier :  
     ```
     app/build/outputs/apk/debug/app-debug.apk
     ```
2. **Transférer l’APK sur votre appareil Android**  
   - Copier le fichier `app-debug.apk` sur votre smartphone (via câble USB, Bluetooth,...).  

3. **Autoriser les sources inconnues**  
   - Sur votre appareil Android, aller dans **Paramètres > Sécurité**.  
   - Activer l’option **Installer des applications depuis des sources inconnues**.  

4. **Installer l’APK**  
   - Ouvrir le fichier `app-debug.apk` sur votre smartphone.  
   - Suivre les instructions pour installer l’application.  

5. **Lancer l’application**  
   - Une fois installée, l’application sera disponible dans le menu des applications sous le nom **PizzaRecipes**.
---


---

## ⚙️ Fonctionnalités
- **MainActivity** :
  - Configure `ViewPager2` et `TabLayout`.
  - Utilise `ViewPagerAdapter` pour gérer les fragments.
  - Ajoute une boîte de dialogue de confirmation lors de la fermeture de l’application.

- **TempFragment** :
  - Champs `EditText` pour saisir une valeur.
  - `RadioButton` pour choisir la conversion (Celsius → Fahrenheit ou Fahrenheit → Celsius).
  - Bouton **Convertir** qui affiche le résultat formaté.

- **DistanceFragment** :
  - Champs `EditText` pour saisir une valeur.
  - `RadioButton` pour choisir la conversion (Km → Miles ou Miles → Km).
  - Bouton **Convertir** qui affiche le résultat formaté.

- **ViewPagerAdapter** :
  - Fournit les fragments au `ViewPager2`.
  - Retourne `TempFragment` ou `DistanceFragment` selon l’onglet sélectionné.

---

## 🖥️ Exemple d’exécution
- **Onglet Température** :  
- <img width="472" height="451" alt="image" src="https://github.com/user-attachments/assets/0add2bd1-e66a-4012-8172-e29023c61c84" />
- **Onglet Distance** :  
- <img width="472" height="451" alt="image" src="https://github.com/user-attachments/assets/1591c672-3065-4c81-9f1a-7f6ca51895ef" />
- **Fermeture de l’application** :  
Une boîte de dialogue s’affiche :  
- <img width="472" height="451" alt="image" src="https://github.com/user-attachments/assets/47d1f1ca-ef15-461f-99e3-10e3acb6958a" />
---

## 💡 Concepts pratiqués
- Utilisation de **ViewPager2** et **TabLayoutMediator** pour la navigation par onglets.
- Gestion des **Fragments** pour modulariser les fonctionnalités.
- Validation des entrées utilisateur (`TextUtils.isEmpty`).
- Conversion mathématique simple avec affichage formaté (`String.format`).
- Gestion du cycle de vie et interaction utilisateur avec `Toast` et `AlertDialog`.

---

## 🧑‍💻 Auteur
👤 **Agouram Hassan**  
📱 Développement Android Java  
🎓 Instructor : **Mr. LACHGAR**  
📅 25 Mars 2026
