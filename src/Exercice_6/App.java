package Exercice_6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Écrivez un programme Java qui demande deux chiffres à un utilisateur,
        // pour afficher la somme (addition), multiplier, soustraire, diviser et le
        // reste.v

        System.out.print("Entrez le premier chiffre : ");
        int chiffre1 = scanner.nextInt();

        System.out.print("Entrez le second chiffre : ");
        int chiffre2 = scanner.nextInt();

        int somme = chiffre1 + chiffre2;
        int multiplier = chiffre1 * chiffre2;
        int soustraire = chiffre1 - chiffre2;

        int diviser = chiffre1 / chiffre2;
        int reste = chiffre1 % chiffre2;

        System.out.println("Somme : " + somme);
        System.out.println("Produit : " + multiplier);
        System.out.println("Différence : " + soustraire);
        System.out.println("Quotient : " + diviser);
        System.out.println("Reste : " + reste);

        scanner.close();
    }
}
