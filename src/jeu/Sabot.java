package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Attaque;
import cartes.Carte;

public class Sabot implements Iterable<Carte> {
	private Carte[] cartes;
	private int nbCartes = 0;
	private int nbOperations = 0;

	public Sabot(int capacites) {
		cartes = new Carte[capacites];
	}

	public int getNbCartes() {
		return nbCartes;
	}

	public boolean estVide() {
		return nbCartes != 0;
	}

	private void ajouterCarte(Carte carte) throws ArrayIndexOutOfBoundsException {
		if (nbCartes < cartes.length) {
			cartes[nbCartes] = carte;
			nbCartes++;
			nbOperations++;
		} else {
			throw new ArrayIndexOutOfBoundsException("capacite depasse");
		}
	}

	public void ajouterFamilleCarte(Carte carte) {
		for (int i = 1; i <= carte.getNombre(); i++) {
			ajouterCarte(carte);
		}
	}

	public void ajouterFamilleCarte(Carte... cartes) {
		for (Carte familleCarte : cartes) {
			ajouterFamilleCarte(familleCarte);
		}
	}

	public Iterator<Carte> iterator() {
		return new Iterateur();
	}

	private class Iterateur implements Iterator<Carte> {
		private int indiceIterateur = 0;
		private int nbOpRef = nbOperations;
		private boolean nextEffectue = false;

		public boolean hasNext() {
			return indiceIterateur < nbCartes;
		}

		public Carte next() {
			verificationConcurrence();
			if (hasNext()) {
				Carte carte = cartes[indiceIterateur];
				indiceIterateur++;
				nextEffectue = true;
				return carte;
			} else {
				throw new NoSuchElementException();
			}
		}

		@Override
		public void remove() throws IllegalStateException {
			verificationConcurrence();
			if (nbCartes < 1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			for (int i = indiceIterateur - 1; i < nbCartes - 1; i++) {
				cartes[i] = cartes[i + 1];
			}
			nextEffectue = false;
			indiceIterateur--;
			nbCartes--;
			nbOperations++;
			nbOpRef++;
		}

		private void verificationConcurrence() throws ConcurrentModificationException {
			if (nbOperations != nbOpRef)
				throw new ConcurrentModificationException();
		}
	}

	public Carte piocher() {
		Iterator<Carte> iter = this.iterator();
		if (iter.hasNext()) {
			Carte cartepioche = iter.next();
			iter.remove();
			System.out.println("Je pioche " + cartepioche);
			return cartepioche;
		} else
			return null;

	}
	
	

}
