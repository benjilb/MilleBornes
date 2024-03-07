package testeFonctionnels;


import java.util.Iterator;

import cartes.*;
import cartes.Probleme.Type;
import jeu.Sabot;

public class Test {

	public static void main(String[] args) {
		Sabot sabot = new Sabot(110);
		sabot.ajouterFamilleCarte(new Attaque(3, Type.ACCIDENT));
		sabot.ajouterFamilleCarte(new Parade(3, Type.ACCIDENT));
		sabot.ajouterFamilleCarte(new Botte(1, Type.ACCIDENT));
		
		System.out.println(sabot.getNbCartes());
		
		/*for(int i = 0; i < sabot.getNbCartes(); i++) {
			Carte carte = sabot.piocher();
		}*/
		
		
		Iterator<Carte> iter = sabot.iterator();
		for(int i = 0; i < sabot.getNbCartes(); i++ ) {
			
			Carte carte = iter.next();
			//Carte c = sabot.piocher();
			System.out.println("Je pioche " + carte);
		}
		
		
	}
}