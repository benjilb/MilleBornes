package jeu;

import java.util.ArrayList;
import java.util.List;

import cartes.Carte;

public class MainAsListe implements Main{
	List<Carte> listeCarte = new ArrayList<>();
	
	@Override
	public void prendre(Carte c) {
		listeCarte.add(c);
	}
}
