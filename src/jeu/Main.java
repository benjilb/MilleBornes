package jeu;

import java.util.Iterator;

import cartes.Carte;

public interface Main {
	void prendre(Carte c);
	void jouer(Carte c);
	Iterator<Carte> Iterateur();
}
