package testeFonctionnels;

import java.util.ArrayList;
import java.util.List;


import jeu.Joueur;

import cartes.*;
import cartes.Probleme.Type;
import jeu.Sabot;
import jeu.ZoneDeJeu;
import utils.Utils;

public class Testjoueur {

	public static void main(String[] args) {
		ZoneDeJeu jeu = new ZoneDeJeu();
		List<Carte> sab = new ArrayList<>();
		Joueur j1 = new Joueur("benjamin",jeu);
		Borne b = new Borne(5,25);
		Borne b1 = new Borne(1,50);
		j1.deposer(b);
		j1.deposer(b1);
		j1.deposer(b1);
		System.out.println(j1.donnerKmParcourus());
		
		/*Carte t1 = new DebutLimite(1);
		Carte t2 = new FinLimite(2);
		System.out.println(t1.equals(t2));
*/
	}

}
