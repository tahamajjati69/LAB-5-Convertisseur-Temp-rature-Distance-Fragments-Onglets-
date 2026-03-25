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


https://github.com/user-attachments/assets/97c2027d-8944-4156-84bd-df49baf842e5




---

## 💡 Concepts pratiqués
- Utilisation de **ViewPager2** et **TabLayoutMediator** pour la navigation par onglets.
- Gestion des **Fragments** pour modulariser les fonctionnalités.
- Validation des entrées utilisateur (`TextUtils.isEmpty`).
- Conversion mathématique simple avec affichage formaté (`String.format`).
- Gestion du cycle de vie et interaction utilisateur avec `Toast` et `AlertDialog`.

---

## 🧑‍💻 Auteur
👤 **Majjati Mohamed Taha**  
📱 Développement Android Java  
🎓 Instructor : **Mr. LACHGAR**  
📅 25 Mars 2026
