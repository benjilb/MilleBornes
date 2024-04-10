package jeu;
import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.TreeSet;

import cartes.*;

public class ZoneDeJeu {
	private Stack<Limite> limitesVitesse = new Stack<>();
	private Stack<Bataille> bataille = new Stack<>();
	private List<Borne> bornes = new ArrayList<>();
	private NavigableSet<Carte> pileBottes = new TreeSet<>();
	

	public void deposerBorne(Borne b) {
		bornes.add(b);
	}
	

	public void deposerLimite(Limite l) {
		limitesVitesse.add(l);
	}
	
	public void deposerBataille(Bataille b) {
		bataille.add(b);
	}
	
	
	public int donnerKmParcourus() {
		int somme = 0;
		for(Borne carte: bornes) {
			somme+= carte.getKm();
		}
		return somme;
	}

	
	public int donnerLimitationVitesse() {
		
		Limite limite = limitesVitesse.peek();
		//for (int i = 0; i < ; i++) {
		if(limitesVitesse.isEmpty() || limite instanceof FinLimite /* Botte FEU*/ ) {
			return 200;
		} else {
			return 50;
		}
		
	}
	
}
