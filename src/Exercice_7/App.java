package Exercice_7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Écrivez un programme Java qui accepte trois nombres et
        // affiche "Tous les nombres sont égaux" si les trois nombres sont égaux,
        // "Tous les nombres sont différents" si les trois nombres sont différents
        // et sinon "Ni tous ni égaux ni différents".

        System.out.print("Entrez le premier chiffre : ");
        int chiffre1 = scanner.nextInt();

        System.out.print("Entrez le deuxième chiffre : ");
        int chiffre2 = scanner.nextInt();

        System.out.print("Entrez le ttroisième chiffre : ");
        int chiffre3 = scanner.nextInt();

        if (chiffre1 == chiffre2 && chiffre1 == chiffre3) {
            System.out.println("tous les nombres sont égaux");
        } else if (chiffre1 != chiffre2 && chiffre1 != chiffre3) {
            System.out.println("tous les nombres sont différents");
        }
        else {
            System.out.println("Ni tous ni égaux ni différents");
        }

        scanner.close();

    }
}
