package cartes;

public class Attaque extends Bataille{

	public Attaque(int nombre, Type type) {
		super(nombre, type);

	}
	@Override
	public String toString() {
		String nomType = " ";
		switch(getType()) {
		
		case FEU:
			nomType = "Feu rouge";
		case ESSENCE:
			nomType = "Panne d'essence";
		case CREVAISON:
			nomType = "Crevaison";
		case ACCIDENT:
			nomType = "Accident";
		
		}
		return nomType;
		
	}
}
