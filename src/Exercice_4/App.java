package Exercice_4;

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in);
    
    //Une boutique propose à ses clients, une réduction de 15% pour 
    //les montants d’achat supérieurs à 200 Euros. 
    //Écrire un programme en Java permettant de saisir le prix total HT 
    //et de calculer le  montant TTC en prenant en compte la réduction et la TVA=20%. 
    
    double prix_ht = scanner.nextDouble();
    double prix_reduction = scanner.nextDouble();
    double tarif_tva = 0.20;
    double prix_ttc = prix_ht * tarif_tva;
    
    System.out.println("Veuillez saisir le montant de vos achats");

    if (prix_ht > 200){
      prix_ht = prix_ht * prix_reduction;
      prix_ttc = prix_ht * tarif_tva;
        System.out.println("le montant total de vos achats est de" + prix_ttc);
    break;
    }
    else if (prix_ht =< 200){
      prix_ttc = prix_ht * tarif_tva;
        System.out.println("le montant total de vos achats est de" + prix_ttc);
    break;
    }
    
     

    scanner.close();
    }
}
