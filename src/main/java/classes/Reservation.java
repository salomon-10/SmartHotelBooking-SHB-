package classes;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Reservation {

        private static List<Reservation> ListReservations = new ArrayList<>();
        private static String Name;
        private static int chambreNumero;
        static int op;
        private static Scanner sc = new Scanner(System.in);
        private static boolean accepted;

        public Reservation(String Name, int chambreNumero) {
            this.Name = Name;
            this.chambreNumero = chambreNumero;
            this.accepted = true;
            ListReservations.add(this);
        }

        public static Reservation reserverChambre(String Name, int chambreNumero) {
            Reservation reservation = new Reservation(Name, chambreNumero);
            System.out.println("✅ Réservation confirmée : " + Name + " - Chambre " + chambreNumero);
            return reservation;
        }

        public static void annulerReservation() {
            if (accepted) {
                accepted = false;
                System.out.println("❌ Réservation annulée pour " + Name + " - Chambre " + chambreNumero);
            } else {
                System.out.println("⚠️ 🧐🧐 réservation est déjà annulée.");
            }
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
        System.out.println("1-reserver;" +
                           "2-annuler un reservation;" +
                           "3-liste des reservation");
        op=sc.nextInt();
        switch (op){
            case 1:  reserverChambre(sc.nextLine(),sc.nextInt());
                break;
            case 2: annulerReservation();
                break;
            case 3: ReservationsClient(sc.nextLine());
                break;
        }
    }}




