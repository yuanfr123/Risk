package risk;

import java.util.Date;
import risk.model.*;
import java.util.Scanner;

public class Risk {	
	public static void main(String[] args) {
						
	    /** Deb - A decommenter apres test 
	     * Reste A Faire => bloquer saisies
	     * Lier à l'interface 
	     */
//		 Declencheur : Onclick sur "lancer partie"
//		// Ajouter joueur à la manche
//		Joueur[] participants = new Joueur[6];
//	    Scanner scanner = new Scanner(System.in);
//
//	    // Récuperation informations joueurs
//		for (int nbJoueurs = 1; nbJoueurs <= 6; nbJoueurs++) {
//	        System.out.println("Saisissez les informations du Joueur n°"+(nbJoueurs));
//
//	        System.out.print("Identifiant : ");
//	        String id = scanner.next();
//	        System.out.print("Nom : ");
//	        String nom = scanner.next();
//	        System.out.print("Prénom : ");
//	        String prenom = scanner.next();
//	        System.out.print("Date de naissance : ");
//	        String dtNaissance = scanner.next();
//	        
//			participants[nbJoueurs-1] = new Joueur(id, nom, prenom, dtNaissance);
//		}
	    /** Fin - A decommenter apres test*/

		
	    /** Deb - A supprimer apres test*/
		String dn = "10/10/2020";
		Joueur j1 = new Joueur("1", "AA", "aa", dn);
		Joueur j2 = new Joueur("2", "BB", "bb", dn);
		Joueur j3 = new Joueur("3", "CC", "cc", dn);
		Joueur j4 = new Joueur("4", "DD", "dd", dn);
		Joueur j5 = new Joueur("5", "EE", "ee", dn);
		Joueur j6 = new Joueur("6", "FF", "ff", dn);
		Joueur[] participants = {j1, j2, j3, j4, j5, j6};
	    /** Fin - A supprimer apres test*/

		// Initialisation de la manche 
		Manche manche1 = new Manche(participants);
        System.out.println(manche1.toString());  
        
        // Determination du joueur qui commencera le tour et oganisation de l'ordre des joueurs dans la manche
        LancerDes des = new LancerDes();
        int resultatDes = des.lancerDes();
        System.out.println(resultatDes);        
        manche1.definirOrdreJoueur(resultatDes);
        System.out.println(manche1.toString());  
	}
}