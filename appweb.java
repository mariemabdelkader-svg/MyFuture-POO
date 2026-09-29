import java.util.Scanner;

public class appweb {

    public static void main(String[] args) {

        String cin;
        String nom;
        String prenom;
        String numcompte;
        double solde;
        final double plafond_retrait = 500.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le CIN : ");
        cin = scanner.nextLine();

        System.out.print("Entrer le nom : ");
        nom = scanner.nextLine();

        System.out.print("Entrer le prenom : ");
        prenom = scanner.nextLine();

        System.out.print("Entrer le numero de compte : ");
        numcompte = scanner.nextLine();

        System.out.print("Entrer le solde initial : ");
        solde = scanner.nextDouble();

        System.out.print("Entrer votre choix : ");
        int choix = scanner.nextInt();

        switch (choix) {

            case 1:
                System.out.println("Client : " + nom + " " + prenom + " (CIN : " + cin + ")");
                System.out.println("N° de Compte : " + numcompte);
                System.out.println("Solde Actuel : " + solde + " TND");
                System.out.println("Plafond Max : " + plafond_retrait + " TND");
                break;
        }

        scanner.close();
    }
}
