package jeu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import cartes.Carte;

public class MainAsListe implements Main{
	List<Carte> listeCarte = new ArrayList<>();
	
	@Override
	public void prendre(Carte c) {
		listeCarte.add(c);
	}
	
	public void jouer(Carte c) {
		assert(listeCarte.contains(c) == true);
		listeCarte.remove(c);
	}
	
	@Override
	public String toString() {
		return "[Main=" + listeCarte + "]";
	}
	
	@Override
	public Iterator<Carte> Iterateur() {
		// TODO Auto-generated method stub
		return null;
	}
}
