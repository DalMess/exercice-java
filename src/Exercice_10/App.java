package Exercice_10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Écrivez un programme Java qui inverse une chaîne de caractères.

        StringBuilder str = new StringBuilder("Hello World!");
        System.out.println(str.toString());
        str.reverse();
        System.out.println(str.toString());
        scanner.close();
    }
}
