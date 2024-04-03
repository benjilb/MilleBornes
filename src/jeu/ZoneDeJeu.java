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
	
	
}
