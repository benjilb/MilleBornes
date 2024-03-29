package cartes;

public class Parade extends Bataille {

	public Parade(int nombre, Type type) {
		super(nombre, type);
	}
	@Override
	public String toString() {
		String nomType = " ";
		switch(getType()) {
		
		case FEU:
			nomType = "Feu vert";
			break;
		case ESSENCE:
			nomType = "Essence";
			break;
		case CREVAISON:
			nomType = "Roue de secours";
			break;
		case ACCIDENT:
			nomType = "Reparation";
			break;
		
		}
		return nomType;
		
	}
	
	@Override
	public boolean equals(Object objet){
	    if (objet instanceof Parade){
	        Parade parade = (Parade) objet;
	        return type.equals(parade.getType());
	    }
	    return false;
	} 
}
