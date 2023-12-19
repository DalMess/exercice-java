//Écrivez un programme Java qui itère les entiers de 1 à 100 :
//‐ Pour les multiples de trois, imprimez "Fizz" au lieu du nombre et pour les multiples de cinq
//imprimez "Buzz".
//‐ Pour les nombres qui sont des multiples de trois et cinq, imprimez "FizzBuzz".

package Exercice_9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int[] nombre = new int[10];

        nombre[1] = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            if (nombre[i] % 3 == 0) {
                System.out.println("fizz");
            } else if (nombre[i] % 5 == 0) {
                System.out.println("buzz");
            } else if (nombre[i] % 3 == 0 && nombre[i] % 5 == 0) {
                System.out.println("fizzbuzz");
            }

        }
        scanner.close();
    }

}
