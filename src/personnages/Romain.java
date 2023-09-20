package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe !");
		} else {
			parler("J'abandonne...");
		}
	}
	public static void main(String[] args) {
		Romain Cesar = new Romain("Cesar",9);
		Gaulois Asterix = new Gaulois("Asterix",10);
		Cesar.parler("Bonjouer je suis l'empereur des Romains.");
		Cesar.recevoirCoup(10);
	}
}
