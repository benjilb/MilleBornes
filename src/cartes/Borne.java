package cartes;

public class Borne extends Carte {
	private int km;

	public Borne(int nombre, int km) {
		super(nombre);
		this.km = km;
	}

	public int getKm() {
		return km;
	}
	
	public String toString() {
		return "km = " + km;
	}

}
