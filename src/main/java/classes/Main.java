package classes;

import java.util.Scanner;

public class Main {

    static int choix;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("WELCOME, BIENVENUE");
        System.out.println(" ");

        // Menu principal
        while (true) {
            System.out.println("=== SmartHotelBooking ===");
            System.out.println("1. Gestion des Chambres");
            System.out.println("2. Gestion des Clients");
            System.out.println("3. Gestion des Réservations");
            System.out.println("0. Quitter");
            System.out.print("Choix: ");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    menuChambres();
                    break;
                case 2:
                    menuClients();
                    break;
                case 3:
                    menuReservations();
                    break;
                case 0:
                    System.out.println("Merci et à bientôt !");
                    return;
                default:
                    System.out.println("Choix invalide, réessayez.");
            }
        }
    }

    // Menu chambres
    public static void menuChambres() {
        int op;
        while (true) {
            System.out.println("\n=== Menu Gestion des Chambres ===");
            System.out.println("1. Ajouter une chambre");
            System.out.println("2. Afficher les chambres disponibles");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    Chambre.ajouterChambre();
                    break;
                case 2:
                    Chambre.afficherChambresDisponibles();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Choix invalide !");
            }
        }
    }

    // Menu clients
    public static void menuClients() {
        int choix;
        while (true) {
            System.out.println("\n=== Menu Gestion des Clients ===");
            System.out.println("1. Inscrire un client");
            System.out.println("2. Afficher la liste des clients");
            System.out.println("3. Supprimer un client");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez l'ID du client : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Entrez le nom du client : ");
                    String username = scanner.nextLine();

                    Clients.inscrireClient(id, username);
                    break;
                case 2:
                    Clients.afficherClients();
                    break;
                case 3:
                    System.out.print("Entrez l'ID du client à supprimer : ");
                    int idSuppression = scanner.nextInt();
                    Clients.supprimerClient(idSuppression);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choix invalide !");
            }
        }

    }

    // Menu réservations
    public static void menuReservations() {
        int option;
        while (true) {
            System.out.println("\n=== Menu Gestion des Réservations ===");
            System.out.println("1. Réserver une chambre");
            System.out.println("2. Annuler une réservation");
            System.out.println("3. Afficher les réservations d'un client");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Entrez le nom du client : ");
                    String Name = scanner.nextLine();
                    scanner.nextLine();

                    System.out.print("Entrez le numéro de la chambre à réserver : ");
                    int chambreNumero = scanner.nextInt();

                    Reservation.reserverChambre(Name, chambreNumero);
                    break;
                case 2:
                    System.out.print("Entrez le nom du client pour annuler la réservation : ");
                    String name = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Entrez le numéro de la chambre : ");
                    int chambre = scanner.nextInt();

                    //  annulation
                    Reservation reservation = new Reservation(name, chambre);
                    reservation.annulerReservation();
                    break;
                case 3:
                    System.out.print("Entrez le nom du client pour afficher ses réservations : ");
                    String clientName = scanner.nextLine();

                    Reservation.ReservationsClient(clientName);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choix invalide !");
            }
        }
    }
}
