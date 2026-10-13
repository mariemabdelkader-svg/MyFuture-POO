import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        /*Scanner x = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        double y = x.nextDouble();

        double resultat = y * 2;

        System.out.println("Le double  : " + resultat);*/

        Scanner nb1 = new Scanner(System.in);
        Scanner nb2 = new Scanner(System.in);

        System.out.print("premier nb : ");
        double a = nb1.nextDouble();

        System.out.print("deuxième nb : ");
        double b = nb2.nextDouble();

        if (a > b) {
            System.out.println("Le plus grand est : " + a);
        } else {
            System.out.println("Le plus grand est : " + b);
        } 
       

    }

}
