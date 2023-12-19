package Exercice_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Écrire un programme en Java qui demande l'âge d'un enfant et permet
        // d'informer de sa catégorie
        // sachant que les catégories sont les suivantes:
        // "poussin de 6 a 7 ans"
        // "pupille de 8 a 9 ans "
        // "minime de 10 a 11 ans "
        // " cadet après 12 ans ".

        System.out.println("Veuillez saisir l'âge de l'enfant");
        int ageEnfant = scanner.nextInt();
        switch (ageEnfant) {
            case 6:
            case 7:
                System.out.println("poussin de 6 à 7 ans");
                break;
            case 8:
            case 9:
                System.out.println("pupille de 8 à 9 ans");
                break;
            case 10:
            case 11:
                System.out.println("minime de 10 à 11 ans");
                break;
            case 12:
                System.out.println("cadet après 12 ans");
                break;
            default:
                System.out.println("âge non valide");
        }
        scanner.close();
    }
}
