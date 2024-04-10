package jeu;

import java.util.List;
import java.util.Stack;

import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.FinLimite;
import cartes.Limite;

public class Joueur {
	private String nom;
	private ZoneDeJeu jeu;
	private MainAsListe main = new MainAsListe();
	
	
	public Joueur(String nom, ZoneDeJeu jeu) {
		super();
		this.nom = nom;
		this.jeu = jeu;
	}
	
	
	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + "]";
	}
	
	@Override
	public boolean equals(Object objet){
	    if (objet instanceof Joueur){
	        Joueur joueur = (Joueur) objet;
	        return nom.equals(joueur.getNom());
	    }
	    return false;
	} 
	
	public void donner(Carte c) {
		main.prendre(c);
	}
	
	Carte prendreCarte(List<Carte> sabot) {
		if(sabot.size()>0) {
			Carte c = sabot.get(0);
			main.prendre(c);
			sabot.remove(0);
			return c;
		} else {
			return null;
		}
	}
	
	public boolean deposer(Borne borne) {
		jeu.deposerBorne(borne);
		return true;
	}
	
	public int donnerKmParcourus() {
		return jeu.donnerKmParcourus();
	}
	
	public int donnerLimitationVitesse() {
		return jeu.donnerLimitationVitesse();
		
	}
	
	
}
