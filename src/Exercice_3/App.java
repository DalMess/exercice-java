package Exercice_3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in);

    //Écrire  un programme en Java  qui  permet d'échanger le contenu de deux entiers  
    //A et B  saisis par l'utilisateur. et afficher ces entiers  après l’échange. 
    
    System.out.println("Veuillez saisir le premier nombre");
    int a = scanner.nextInt();

    System.out.println("Veuillez saisir le premier nombre");
    int b = scanner.nextInt();

    
    a= b;
    b = a;
        System.out.println("A = " + a);
        System.out.println("B = " + b);

    scanner.close();
    }
}
