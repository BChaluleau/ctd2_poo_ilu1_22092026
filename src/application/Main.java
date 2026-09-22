package application;

import personnage.Gaulois;
import personnage.Romain;

public class Main {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 1);
		asterix.parler("Bonjour");
		// asterix.parler("Je suis fort comme " + asterix.force); // attribut privé !
		Romain minux = new Romain("Minux", 4);
		asterix.frapper(minux);
		asterix.frapper(minux);
		asterix.frapper(minux);
		asterix.frapper(minux);
		asterix.frapper(minux);
		asterix.frapper(minux);

	}

}
