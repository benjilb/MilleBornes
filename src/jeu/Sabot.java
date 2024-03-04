package jeu;

import cartes.Carte;

public class Sabot {
	private Carte[] cartes;
	private int nbCartes;

	public Sabot(int nbCartes, int capacites) {
		cartes = new Carte[capacites];
		this.nbCartes = nbCartes;
	}
	
	public boolean estVide() {
		if( nbCartes != 0) {
			return false;
		} else {
			return true;
		}
	}
	
	private void ajouterCarte() throws ArrayIndexOutOfBoundsException{
		if(nbCartes < cartes.length ) {
			nbCartes++;
		}
		else {
			throw new ArrayIndexOutOfBoundsException("capacite depasse");
		}
	}
}
