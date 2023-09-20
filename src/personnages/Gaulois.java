package personnages;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un coup dans la mâchoire de "
				+ romain.getNom());
		romain.recevoirCoup(force/3*effetPotion);
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
				+ ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		if (forcePotion==3) {
			parler("Merci Druide, je sens que ma force est 3 fois décuplée.");
		}
	}
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix",10);
		Romain Cesar = new Romain("Cesar",9);
		System.out.println(Asterix);
		Asterix.parler("Bonjour, je suis le gaulois " + Asterix.getNom());
		Asterix.boirePotion(5);
		Asterix.frapper(Cesar);
	}
}
