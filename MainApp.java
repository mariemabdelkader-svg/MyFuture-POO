import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        Client c1 = new Client(
                "07123456",
                "Ben Salah",
                "Sonia",
                "98765432");

        Client c2 = new Client(
                "09876543",
                "Kacem",
                "Ahmed",
                "50112233");

        CompteBancaire compte1 = new CompteBancaire(
                "CB-1001",
                500.0,
                c1);

        CompteBancaire compte2 = new CompteBancaire(
                "CB-1002",
                1500.0,
                c2);

        System.out.println(" ETAT INITIAL ");

        compte1.afficherDetails();

        System.out.println();

        compte2.afficherDetails();

     
        System.out.println(" TEST DEPOT ");

        compte1.deposer(200.0);

        System.out.println(" TEST RETRAIT ");

        compte1.retirer(300.0);

 
        System.out.println(" TEST VIREMENT ");

        compte2.virer(compte1, 500.0);

        
        System.out.println(" ETAT FINAL ");

        compte1.afficherDetails();

        System.out.println();

        compte2.afficherDetails();

        System.out.println(
                "Nombre total de comptes créés : "
                        + CompteBancaire.getNombreComptes());

        scanner.close();
    }
}