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
			break;
		case ESSENCE:
			nomType = "Panne d'essence";
			break;
		case CREVAISON:
			nomType = "Crevaison";
			break;
		case ACCIDENT:
			nomType = "Accident";
			break;
		}
		return nomType;
		
	}
}
