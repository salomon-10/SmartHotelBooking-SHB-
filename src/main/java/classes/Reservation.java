package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reservation {
    private static List<Reservation> ListReservations = new ArrayList<>();
    private static String Name;
    private static int chambreNumero;
    private boolean accepted;

    private static Scanner sc = new Scanner(System.in);

    public Reservation(String Name, int chambreNumero) {
        this.Name = Name;
        this.chambreNumero = chambreNumero;
        this.accepted = true;
    }

    public static Reservation reserverChambre(String Name, int chambreNumero) {
        Reservation reservation = new Reservation(Name, chambreNumero);
        ListReservations.add(reservation);
        System.out.println("✅ Réservation confirmée : " + Name + " - Chambre " + chambreNumero);
        return reservation;
    }

    public static void annulerReservation() {
        for (Reservation reservation : ListReservations) {
            if (reservation.Name.equals(Name) && reservation.chambreNumero == chambreNumero && reservation.accepted) {
                reservation.accepted = false;
                System.out.println("❌ Réservation annulée pour " + Name + " - Chambre " + chambreNumero);
                return;
            }
        }
        System.out.println("⚠️ Réservation introuvable ou déjà annulée.");
    }

    public static void ReservationsClient(String Name) {
        System.out.println("\n📋 Réservations pour : " + Name);
        boolean found = false;
        for (Reservation reservation : ListReservations) {
            if (reservation.Name.equals(Name) && reservation.accepted) {
                System.out.println("➡️ Chambre " + reservation.chambreNumero);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucune réservation active trouvée.");
        }
    }

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("\n=== Menu Réservation ===");
            System.out.println("1. Réserver une chambre");
            System.out.println("2. Annuler une réservation");
            System.out.println("3. Liste des réservations");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            op = sc.nextInt();
            sc.nextLine(); // Nettoie le buffer

            switch (op) {
                case 1:
                    System.out.print("Entrez votre nom : ");
                    String name = sc.nextLine();
                    System.out.print("Entrez le numéro de chambre : ");
                    int chambre = sc.nextInt();
                    reserverChambre(name, chambre);
                    break;

                case 2:
                    System.out.print("Entrez votre nom : ");
                    name = sc.nextLine();
                    System.out.print("Entrez le numéro de chambre à annuler : ");
                    chambre = sc.nextInt();
                    annulerReservation();
                    break;

                case 3:
                    System.out.print("Entrez votre nom : ");
                    name = sc.nextLine();
                    ReservationsClient(name);
                    break;

                case 0:
                    System.out.println("Merci d'utiliser notre service de réservation !");
                    break;

                default:
                    System.out.println("⚠ Choix invalide !");
            }
        } while (op != 0);

        sc.close();
    }
}

