package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Ast�rix",8);
		Romain Minus = new Romain("Minus",6);
		Asterix.parler("Bonjour � tous");
		Minus.parler("UN GAU...UN GAUGAU...");
		for (int i = 0; i < 3; i++) {
			Asterix.frapper(Minus);
		}
	}
}
