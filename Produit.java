import java.util.Scanner;

public class Produit {

    private String reference;
    private String designation;
    private double prixHT;
    private int quantiteStock;

    public Produit(String r, String d, double p, int q) {
        reference = r;
        designation = d;
        prixHT = p;
        quantiteStock = q;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String r) {
        reference = r;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String d) {
        designation = d;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double p) {
        prixHT = p;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int q) {
        quantiteStock = q;
    }

    public double calculValeurStock() {
        return prixHT * quantiteStock;
    }

    public double appliquerRemise(double remise) {
        return prixHT - (prixHT * remise / 100);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produit p = new Produit("", "", 0, 0);

        int choix;

        do {
            System.out.print("Donner votre choix (1, 2, 3 ou 4) : ");
            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.print("Donner la reference : ");
                    String ref = sc.next();

                    System.out.print("Donner la designation : ");
                    String des = sc.next();

                    System.out.print("Donner le prix HT : ");
                    double prix = sc.nextDouble();

                    System.out.print("Donner la quantite : ");
                    int qte = sc.nextInt();

                    p.setReference(ref);
                    p.setDesignation(des);
                    p.setPrixHT(prix);
                    p.setQuantiteStock(qte);

                    break;

                case 2:
                    System.out.println("Valeur du stock : " + p.calculValeurStock());
                    break;

                case 3:
                    System.out.print("Donner le taux de remise (%) : ");
                    double remise = sc.nextDouble();

                    System.out.println("Nouveau prix HT : " + p.appliquerRemise(remise));
                    break;

                case 4:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 4);

        sc.close();
    }
}