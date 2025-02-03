package classes;

import java.util.ArrayList;
import java.util.Scanner;

import static classes.Clients.sc;
import static classes.Reservation.op;

public  class Chambre {
    static Scanner sc = new Scanner(System.in);
    public static String type;
    public static int numero;
    public static double prix;
    private static boolean disponible = true;
    private static ArrayList<Chambre> Listchambres = new ArrayList<>();

    public Chambre(String type, int numero, double prix) {
        this.type = type;
        this.numero = numero;
        this.prix = prix;
    }
    public Chambre() {
    }

    //main
    public static void main (String[]args){
        while (true) {
            System.out.println("1. Ajouter une chambre");
            System.out.println("2. Afficher les chambres");
            System.out.println("3. Quitter");
            System.out.print("Choix : ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    Chambre.ajouterChambre();
                    break;
                case 2:
                    Chambre.afficherChambresDisponibles();
                    break;
                case 3:
                    System.out.println("bye bye.");
                    return;
                default:
                    System.out.println("Choix invalide !");
            }
        }
            }

    //getters&setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("Standard") || type.equals("VIP") || type.equals("Suite")) {
            this.type = type;
        } else {
            System.out.println("INDISPONIBLE - Type invalide !");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Ajouterchambre
    public static void ajouterChambre() {
        System.out.print("Entrez le type de chambre (Standard, VIP, Suite) : ");
        String type = sc.nextLine();

        System.out.print("Entrez le numéro de la chambre : ");
        int numero = sc.nextInt();

        System.out.print("Entrez le prix de la chambre : ");
        double prix = sc.nextDouble();

        Chambre chambre = new Chambre(type, numero, prix);
        Listchambres.add(chambre);
        System.out.println("✅ Chambre ajoutée avec succès !");
    }


    // Supprimerchambre
    public static void supprimerChambre(int numero) {
        boolean disponible = false;
        for (Chambre chambre : Listchambres) {
            if (chambre.getNumero() == numero) {
                Listchambres.remove(chambre);
                System.out.println("Chambre supprimée avec succès !");
                disponible = true;
                break;
            }
        }
    }
        //listchambrre
        public static void afficherChambresDisponibles () {
            System.out.println("\n=== Liste des Chambres Disponibles ===");
            for (Chambre chambre : Listchambres) {
                if (chambre.isDisponible()) {
                    System.out.println("Numéro: " + chambre.getNumero() +
                            ", Type: " + chambre.getType() +
                            ", Prix: " + chambre.getPrix() + "fcfa");
                    disponible = true;
                }
            }

            if (!disponible) {
                System.out.println("Aucune chambre disponible.");
            }

            }


        }




