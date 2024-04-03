package testeFonctionnels;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cartes.*;
import cartes.Probleme.Type;
import jeu.Sabot;
import utils.Utils;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("---- TP1 ----\n");
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
		
		
		System.out.println("---- TP2 ----\n");
		System.out.println("----- TEST JEUDECARTES -----");
		
		
		JeuDeCartes jeu = new JeuDeCartes();
        
		if(jeu.checkcount()) {
			System.out.println("Le jeux est correct");
		} else {
			System.out.println("Le jeux est incorrect");
		}
		
       for (Carte carte : jeu.getListeCartes()) {
            System.out.println(carte.toString());
        }
       
      
        System.out.println("----- TEST UTILS -----");
        List<Carte> listeCarteNonMelangee = jeu.getListeCartes();
        List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelangee);
        System.out.println(listeCartes);
        listeCartes = Utils.melanger(listeCartes);
        System.out.println(listeCartes);
        System.out.println("liste melangee sans erreur ? " + Utils.verifierMelange(listeCarteNonMelangee, listeCartes));
        listeCartes = Utils.rassembler(listeCartes);
        System.out.println(listeCartes);
        System.out.println("liste rassemblee sans erreur ? " + Utils.verifierRassemblement(listeCartes));
       
	}
}