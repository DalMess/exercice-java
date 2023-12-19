package Exercice_8;

import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Écrire un programme en Java qui permet de saisir 10 entiers dans un tableau.
        // - compter combien y a-t-il d'éléments pairs et impairs.


        // - mettre les éléments pairs dans un tableau T1 et les éléments impaires dans
        // un tableau T2.
        // - Puis afficher T1 et T2

        System.out.print("Entrez un nombre entier : ");
        int[] nombre = new int[10];

        nombre[0] = scanner.nextInt();
        Counter nombre = scanner.nextInt();

        scanner.close();

        int[] tableau_1 = new int[10];
        int[] tableau_2 = new int[10];

        for (int i = 0; i < 10; i++) {
            if (nombre[i] % 2 == 0){
                System.out.println( tableau_1 + "est pair");
            }
                
            else {
                System.out.println(tableau_2 + "est impair");

            }
        }
    }
}
