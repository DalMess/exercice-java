//Écrire un programme Java qui permet à l'utilisateur de deviner un nombre 
//choisi aléatoirement par l'ordinateur. 
//Le programme doit donner des indications à l'utilisateur 
//sur si le nombre à deviner est plus grand ou plus petit 
//que la proposition de l'utilisateur. 
//Le jeu doit se poursuivre tant que l'utilisateur n'a pas correctement 
//deviné le nombre.

//Aide :
//La boucle while est appropriée pour cet exercice car 
//le nombre de tentatives nécessaires pour deviner le nombre est inconnu à l'avance. 
//La boucle while continue tant que la condition spécifiée est vraie.

package Exercice_12;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random();

        int randomValue = random.nextInt(100); 
        double randomValue2 = Math.random();

        int scaledValue = (int) (randomValue2 * 101);

        while (true) {
            System.out.println("Veuiller devinez le nombre magique");
            int n = 0;

            if (randomValue2 == randomValue) {
                System.out.println("Félicitations! Vous avez deviné le nombre en " + tentative + " tentatives.");
                break;
            }
            else if (randomValue2 < randomValue){
                System.out.println("Le nombre à deviner est plus grand.");

            }
            else {
                System.out.println("Le nombre à deviner est plus petit.");

            }
        }
    }
}
        


