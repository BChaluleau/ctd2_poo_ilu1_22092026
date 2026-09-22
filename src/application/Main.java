package application;

import personnage.Gaulois;

public class Main {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 666);
		asterix.parler("Bonjour");
		// asterix.parler("Je suis fort comme " + asterix.force); // attribut privé !

	}

}
