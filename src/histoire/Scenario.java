package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Ast�rix",8);
		Gaulois Ob�lix = new Gaulois("Ob�lix",25);
		Romain Minus = new Romain("Minus",6);
		Druide Panoramix = new Druide("Panoramix",5,10);
		Panoramix.parler("Je vais aller pr�parer une potion...");
		Panoramix.preparerPotion();
		Panoramix.booster(Ob�lix);
		Ob�lix.parler("Ce n'est pas juste");
		Asterix.parler("Bonjour");
		Minus.parler("UN GAU...UN GAUGAU...");
		for (int i = 0; i < 3; i++) {
			Asterix.frapper(Minus);
		}
	}
}
