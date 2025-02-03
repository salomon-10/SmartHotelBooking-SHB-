 # Système de Réservation d'Hôtel :SmartHotelBooking  (Java)

## Description
SmartHotelBooking (SHB) est une application Java permettant la gestion des réservations d'un hôtel. Ce projet est conçu pour les débutants souhaitant se familiariser avec les concepts de la Programmation Orientée Objet (POO). Il permet de gérer les utilisateurs, les chambres et les réservations.

## Fonctionnalités
### Gestion des chambres :
- Ajouter une chambre 
- Supprimer une chambre 
- Afficher la liste des chambres disponibles

### Gestion des Clients :
- Inscrire un nouvel Clients
- Afficher la liste des Clients

### Gestion des réservations :
- Réserver une chambre
- Annuler une réservation
- Afficher les réservations d'un Clients

## Objectifs pédagogiques
Ce projet permet d’apprendre les bases de la POO en Java, notamment :
- La création et l’utilisation de classes et d’objets.
- L’organisation d’un projet en packages.
- L’utilisation de collections Java comme ArrayList.
- La gestion des méthodes pour ajouter, supprimer ou mettre à jour des objets.
- Une introduction à la gestion d’exceptions pour éviter les erreurs dans le programme.

## Structure du projet
```
SystèmeReservationHotel/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── hotel/
│   │   │           ├── Main.java               # Point d'entrée du programme
│   │   │           ├── models/
│   │   │           │   ├── Chambre.java        # Classe représentant une chambre
│   │   │           │   ├── Clients.java    # Classe représentant un Clients
│   │   │           │   ├── Reservation.java    # Classe représentant une réservation
│   │   │           ├── services/
│   │   │           │   ├── ChambreService.java # Gestion des chambres
│   │   │           │   ├── ClientsService.java # Gestion des utilisateurs
│   │   │           │   ├── ReservationService.java # Gestion des réservations
│   │   │           ├── storage/
│   │   │           │   ├── ListeStockage.java  # Gestion du stockage des données en mémoire (ArrayList)
│   │   │           ├── ui/
│   │   │           │   ├── MainWindow.java     # Interface graphique
├── .gitignore                                   # Fichier pour ignorer les fichiers inutiles dans Git
├── README.md                                    # Documentation du projet
└── pom.xml                                      # (Si utilisation de Maven)
```

## Technologies Utilisées
- **Langage** : Java
- **Interface graphique** : JavaFX ou Swing
- **Stockage des données** : ArrayList en mémoire

## Installation et Exécution
### Prérequis
- Java 8 ou supérieur
- Maven (optionnel pour la gestion des dépendances)

### Exécution
1. Cloner ce répertoire :
   ```sh
   git clone https://github.com/votre-repo/hotel-reservation.git
   cd hotel-reservation
   ```
2. Compiler et exécuter :
   ```sh
   javac -d bin src/**/*.java
   java -cp bin main.Main
   ```

## Guide d'utilisation
Une fois le programme lancé, un menu interactif s'affiche avec plusieurs options :

```
Bienvenue dans le Système de Réservation d'Hôtel !
1. Ajouter une chambre
2. Supprimer une chambre
3. Afficher les chambres disponibles
4. Inscrire un Clients
5. Afficher les Clients
6. Réserver une chambre
7. Annuler une réservation
0. Quitter
```

L’utilisateur peut saisir un chiffre pour choisir une option.

## Tâches à réaliser
### Étape 1 : Classe Chambre
- Créer une classe `Chambre` avec les attributs suivants :
  - `int numero`
  - `String type`
  - `double prix`
  - `boolean disponible`
- Implémenter un constructeur, des getters/setters, et une méthode `toString()`.

### Étape 2 : Classe Clients
- Créer une classe `Clients` avec :
  - `int id`
  - `String username`
  - `ArrayList<Reservation> reservations`
- Implémenter un constructeur et les getters/setters.

### Étape 3 : Classe Reservation
- Créer une classe `Reservation` qui associe un Clients et une chambre avec les dates d'arrivée et de départ.

### Étape 4 : Implémentation des services
- Ajouter des méthodes pour gérer les chambres, Clients et réservations.
- Ajouter la gestion du stockage en mémoire avec `ArrayList` dans `ListeStockage.java`.

## Améliorations futures (facultatives)
- Ajouter un système de paiement simulé.
- Implémenter une interface graphique (JavaFX ou Swing).
- Ajouter une recherche avancée (par type de chambre, prix, etc.).
- Ajouter une authentification pour les utilisateurs.

## Auteur
**[salomon-10]** - [sikasalomon4@gmail.com]

