package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Clients {
    private int id;
    private String username;
    private static ArrayList<Clients> listeClients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Constructeur
    public Clients(int id, String username) {
        this.id = id;
        this.username = username;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Client[ID=" + id + ", Nom=" + username + "]";
    }

    // Inscrire un client
    public static void inscrireClient(int id, String username) {
        Clients client = new Clients(id, username);
        listeClients.add(client);
        System.out.println("Client inscrit avec succès ✅!");
    }

    // Afficher la liste des clients
    public static void afficherClients() {
        if (listeClients.isEmpty()) {
            System.out.println("Aucun client enregistré.");
        } else {
            for (Clients client : listeClients) {
                System.out.println(client);
            }
        }
    }

    // Supprimer un client
    public static void supprimerClient(int id) {
        Clients clientASupprimer = null;

        for (Clients client : listeClients) {
            if (client.getId() == id) {
                clientASupprimer = client;
                break;
            }
        }

        if (clientASupprimer != null) {
            listeClients.remove(clientASupprimer);
            System.out.println("✅ Client supprimé avec succès !");
        } else {
            System.out.println("⚠ Client introuvable !");
        }
    }

    // Main
    public static void main(String[] args) {
        int choix;

        do {
            System.out.println("\n=== Menu Gestion des Clients ===");
            System.out.println("1. Inscrire un client");
            System.out.println("2. Afficher la liste des clients");
            System.out.println("3. Supprimer un client");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Entrez l'ID du client : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Entrez le nom du client : ");
                    String username = sc.nextLine();
                    inscrireClient(id, username);
                    break;

                case 2:
                    afficherClients();
                    break;

                case 3:
                    System.out.print("Entrez l'ID du client à supprimer : ");
                    int idSuppression = sc.nextInt();
                    supprimerClient(idSuppression);
                    break;

                case 0:
                    System.out.println("Merci d'utiliser notre gestion des clients !");
                    break;

                default:
                    System.out.println("⚠ Choix invalide !");
            }
        } while (choix != 0);

        sc.close();
    }
}
