package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Astérix",8);
		Gaulois Obélix = new Gaulois("Obélix",25);
		Romain Minus = new Romain("Minus",6);
		Druide Panoramix = new Druide("Panoramix",5,10);
		Panoramix.parler("Je vais aller préparer une potion...");
		Panoramix.preparerPotion();
		Panoramix.booster(Obélix);
		Obélix.parler("Ce n'est pas juste");
		Asterix.parler("Bonjour");
		Minus.parler("UN GAU...UN GAUGAU...");
		for (int i = 0; i < 3; i++) {
			Asterix.frapper(Minus);
		}
	}
}
