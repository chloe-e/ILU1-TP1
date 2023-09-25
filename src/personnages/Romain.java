package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		assert force>=0;
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
		assert forceCoup>0;
		int forceInit = this.force;
		System.out.println(force);
		this.force -= forceCoup;
		System.out.println(forceInit);
		if (this.force > 0) {
			parler("Aïe !");
		} else {
			parler("J'abandonne...");
		}
		assert forceInit>this.force;
	}
	public static void main(String[] args) {
		Romain Cesar = new Romain("Cesar",6);
		Cesar.parler("Bonjour je suis l'empereur des Romains.");
		Cesar.recevoirCoup(10);
	}
}
