package cartes;

public class Botte extends Probleme {

	public Botte(int nombre, Type type) {
		super(nombre, type);

	}

	@Override
	public String toString() {
		String nomType = " ";
		switch (getType()) {

		case FEU:
			nomType = "Vehicule prioritaire";
			break;
		case ESSENCE:
			nomType = "Citerne d'essence";
		case CREVAISON:
			nomType = "Increvable";
		case ACCIDENT:
			nomType = "As du volant";

		}
		return nomType;

	}
}
