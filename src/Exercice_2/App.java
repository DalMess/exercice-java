package Exercice_2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        // Écrire un programme en Java qui permet de calculer
        // la somme S=1+2+3+...+ 10. Utilisant la boucle for.

        int somme = 0;

        for (int i = 1; i <= 10; i++) {
            somme += i;
            System.out.println("La somme S est " + somme);

        }
        scanner.close();
    }
}
