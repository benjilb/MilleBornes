package cartes;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import utils.Utils;

public class JeuDeCartes {
    private Carte[] typesDeCartes;
    private List<Carte> listeCartes = new ArrayList<>();

    public JeuDeCartes(Carte[] typesDeCartes) {
        this.typesDeCartes = typesDeCartes;
        
        for (Carte carte : typesDeCartes) {
            for (int i = 0; i < carte.getNombre(); i++) {
                this.listeCartes.add(carte);
            }
        }
    }

    public Carte[] getTypesDeCartes() {
        return typesDeCartes;
    }

    public List<Carte> getListeCartes() {
        return listeCartes;
    }
    

    
    public boolean checkCount(Carte c,int nb) {
		return (c.getNombre() == nb);
		}
    
    
    public Carte[] melangerCartes(Carte[] listeC) {
       
        for (int i = listeCartes.size()-1 ; i > 0; i--) {
        }
        return listeC;
    }

}