package personnage;

public class Romain {
	// attributs
	private String nom;
	private int force;

	// méthodes
	public String getNom() {
		return nom;
	}

	public String prendreParole() {
		return "Le romain " + nom + ": "; // concaténation par +
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + texte);
		// syso + ctrl_espace
	}

}
