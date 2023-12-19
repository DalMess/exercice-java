package Exercice_11;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Écrivez un programme java qui renvoie le plus grand entier dans un tableau.
        // Exemple:
        // int[] tab = {1, 2, 9, 4};

        int[] tab = { 1, 2, 9, 4 };
        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println(max);

        scanner.close();
    }
}
