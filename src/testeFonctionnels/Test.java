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
        Carte[] typesDeCartes = {new Botte(1, Type.FEU), new Botte(1, Type.ESSENCE), new Botte(1, Type.CREVAISON),new Botte(1, Type.ACCIDENT),
        		new Attaque(3, Type.ACCIDENT),new Attaque(5, Type.FEU),new Attaque(3, Type.CREVAISON),new Attaque(3, Type.ESSENCE), 
        		new Parade(14, Type.FEU),new Parade(6, Type.CREVAISON),new Parade(6, Type.ESSENCE),new Parade(14, Type.ACCIDENT),
        		new Borne(10, 25), new Borne(10, 50), new Borne(10, 75), new Borne(12, 100), new Borne(4, 200),
        		new DebutLimite(4), new FinLimite(6)};
            
       JeuDeCartes jeu = new JeuDeCartes(typesDeCartes);
        
       for (Carte carte : jeu.getListeCartes()) {
            System.out.println(carte.toString());
        }
       
        for (Carte typecarte : jeu.getTypesDeCartes()) {
        	//System.out.println(typecarte.toString() + " : " + typecarte.getNombre());
        	if(jeu.checkCount(typecarte, typecarte.getNombre())) {
        		System.out.println(typecarte.toString() + " Nombre exemplaires OK : " + typecarte.getNombre());
        	} else {
        		System.out.println(typecarte.toString() + " Nombre exemplaires mauvais : " + typecarte.getNombre());
        	}
        	
        }
        System.out.println("----- TEST UTILS -----");
        List<Carte> listeCarteNonMelangee = jeu.getListeCartes();
        List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelangee);
        System.out.println(listeCartes);
        listeCartes = Utils.melanger(listeCartes);
        System.out.println(listeCartes);
        System.out.println("liste mélangée sans erreur ? " + Utils.verifierMelange(listeCarteNonMelangee, listeCartes));
        listeCartes = Utils.rassembler(listeCartes);
        System.out.println(listeCartes);
        System.out.println("liste rassemblée sans erreur ? " + Utils.verifierRassemblement(listeCartes));
       
	}
}