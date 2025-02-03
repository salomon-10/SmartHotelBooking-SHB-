package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Clients {
    private int id;
    private static String username;
    private static ArrayList<Clients> listeClients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


    public Clients() {
        this.id = id;
        this.username = username;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    // Inscriptionclient
    public static void inscrireClient(int id, String username) {
        Clients client = new Clients();
        listeClients.add(client);
        System.out.println("Client inscrit avec succès !");
    }

    // Afficher  listeclients
    public static void afficherClients() {
        if (listeClients.isEmpty()) {
            System.out.println("Aucun client enregistré.");
        } else {
            System.out.println("Liste des clients :");
            for (Clients client : listeClients) {
                System.out.println("ID: " + client.getId() + ", Nom: " + client.getUsername());
            }
        }
    }


    // Supprimerclient
    public static void supprimerClient(int id) {
            listeClients.remove(id);
            System.out.println("Client supprimé avec succès !");

    }

        public static void main(String[] args) {
            new Clients();
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
                        System.out.print("Entrez le nom du client : ");
                        String username = sc.nextLine();
                        Clients.inscrireClient(id, username);
                        break;

                    case 2:
                        Clients.afficherClients();
                        break;

                    case 3:
                        System.out.print("Entrez l'ID du client à supprimer : ");
                        int idSuppression = sc.nextInt();
                      Clients.supprimerClient(idSuppression);
                        break;

                    case 0:
                        System.out.println("Merci d'utiliser notre gestion des clients !");
                        break;

                    default:
                        System.out.println("Choix invalide !");
                }
            } while (choix != 0);

            sc.close();
        }
    }


