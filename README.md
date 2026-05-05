# 📍 LAB 11 – GPS et Map (OpenStreetMap)

## 📖 Description

Ce laboratoire consiste à développer une application Android permettant :

- 📡 D’afficher une carte interactive
- 📍 De détecter la position GPS du smartphone
- 📌 D’ajouter un marker à chaque nouvelle position
- 🔄 De centrer automatiquement la carte sur la position actuelle

Ce projet utilise **OpenStreetMap via OSMDroid**, ce qui permet d’éviter l’utilisation de Google Maps API et de carte bancaire.

---

# 🏗 Architecture de l'application

L’application repose sur :

- ✅ OSMDroid (OpenStreetMap)
- ✅ LocationManager (GPS Android)
- ✅ Marker dynamique
- ✅ Permissions de localisation

---

# 🔧 Technologies utilisées

- Java
- Android Studio
- OSMDroid 6.1.17
- LocationManager
- API Android 24+

---

# 🔐 Permissions Android

```xml
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
```

---

# ⚙ Fonctionnement

1. L’application affiche une carte OpenStreetMap.
2. Elle demande la permission de localisation.
3. Le GPS détecte la position de l’utilisateur.
4. La carte se centre automatiquement.
5. Un marker indique la position actuelle.
6. Le marker se met à jour à chaque déplacement.

---

# 🖼 Captures d’écran

## 📱 Screen 1 – Affichage de la carte

Carte OpenStreetMap affichée au lancement :

![Screen 1](screenshots/screen1.png)

---

## 📍 Screen 2 – Position GPS détectée

Marker dynamique affichant la position actuelle :

<img width="448" height="792" alt="image" src="https://github.com/user-attachments/assets/f7d9182a-3e1f-44b8-94f9-2a7e9153f460" />
<img width="444" height="734" alt="image" src="https://github.com/user-attachments/assets/d337375a-859c-402c-b708-3dc9a9e2974c" />


---

# ✅ Étapes de test

1. Activer le GPS du téléphone ou de l’émulateur.
2. Autoriser la permission de localisation.
3. Lancer l’application.
4. Vérifier que :
   - La carte s’affiche correctement.
   - La position est détectée.
   - Le marker se déplace automatiquement.

---

# 🎯 Résultat

✔ Carte fonctionnelle  
✔ GPS détecté correctement  
✔ Marker dynamique  
✔ Zoom automatique  
✔ Solution 100% gratuite (sans Google Maps API)  

---

# 👨‍💻 Auteur

Projet réalisé dans le cadre du module :

**Programmation Mobile – Android avec Java**

Année universitaire 2025–2026
