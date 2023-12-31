package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion "
				+ "peut aller d'une force : " + effetPotionMin + " � " +
				effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void preparerPotion() {
		Random random = new Random();
		int force = this.effetPotionMin + random.nextInt(this.effetPotionMax-this.effetPotionMin);
		if (force>7) {
			parler("J'ai pr�par� une super potion de force " + force + ".");
		} else {
			parler("Je n'ai pas trouv� les ingr�dients, ma potion est seulement "
					+ "de force " + force + ".");
		}
		this.forcePotion = force;
	}
	public void booster(Gaulois guerrier) {
		if (guerrier.getNom()=="Ob�lix") {
			System.out.println("<< Non Ob�lix, tu n'auras pas de potion...>>");
		}
		else {
			guerrier.boirePotion(this.forcePotion);
		}
	}
	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix",5,10);
		Panoramix.preparerPotion();
	}
}
