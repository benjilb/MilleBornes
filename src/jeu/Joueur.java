package jeu;

import cartes.Borne;
import cartes.Botte;

public class Joueur {
	private String nom;
	private ZoneDeJeu jeu;
	
	
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
}
