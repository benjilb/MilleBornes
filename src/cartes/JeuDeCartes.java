package cartes;

import java.util.ArrayList;
import java.util.List;
import cartes.Probleme.Type;
import utils.Utils;

public class JeuDeCartes {
    private Carte[] typesDeCartes = {new Botte(1, Type.FEU), new Botte(1, Type.ESSENCE), new Botte(1, Type.CREVAISON),new Botte(1, Type.ACCIDENT),
    		new Attaque(3, Type.ACCIDENT),new Attaque(5, Type.FEU),new Attaque(3, Type.CREVAISON),new Attaque(3, Type.ESSENCE), 
    		new Parade(14, Type.FEU),new Parade(6, Type.CREVAISON),new Parade(6, Type.ESSENCE),new Parade(14, Type.ACCIDENT),
    		new Borne(10, 25), new Borne(10, 50), new Borne(10, 75), new Borne(12, 100), new Borne(4, 200),
    		new DebutLimite(4), new FinLimite(6)};
    private List<Carte> listeCartes = new ArrayList<>();

    public JeuDeCartes() {
    
        
       for (Carte carte : typesDeCartes) {
            for (int i = 0; i < carte.getNombre(); i++) {
                this.listeCartes.add(carte);
            }
        }
    	listeCartes = Utils.melanger(listeCartes);
    }

    /*public Carte[] getTypesDeCartes() {
        return typesDeCartes;
    }
*/
    public List<Carte> getListeCartes() {
        return listeCartes;
    }
   
    public int count(Carte c) {
    	int nb = 0;
    	for(Carte allCartes : listeCartes ) {
    		if(allCartes.equals(c)) {
    			nb++;
    		}
    	}
    	return nb;
    }
    
    public boolean checkcount() {
    	int nb;
    	boolean countValid = true;
    	for(Carte c : listeCartes) {
    		nb = count(c);
    		if(nb != c.getNombre()) {
    			countValid = false;
    		}
    	}
    	return countValid;
		
	}
    	

}