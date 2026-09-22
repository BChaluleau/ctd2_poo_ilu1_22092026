package personnage;

public class Romain {
	// attributs
	private String nom;
	private int force;

	// constructeur
	public Romain(String nom, int force) {
		this.nom = nom; // collision évitée avec l'attribut
		this.force = force;
	}

	// méthodes
	public String getNom() {
		return nom;
	}

	private String prendreParole() {
		return "Le romain " + nom + ": "; // concaténation par +
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + texte);
		// syso + ctrl_espace
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne.");
		}
	}

}
