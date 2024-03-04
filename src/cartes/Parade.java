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
		case ESSENCE:
			nomType = "Essence";
		case CREVAISON:
			nomType = "Roue de secours";
		case ACCIDENT:
			nomType = "Reparations";
		
		}
		return nomType;
		
	}
}
