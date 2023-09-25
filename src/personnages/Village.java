package personnages;

public class Village {
	private final int NbVillageoisMax;
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom,int NbVillageoisMax) {
		this.NbVillageoisMax = NbVillageoisMax;
		this.nom = nom;
		villageois = new Gaulois[NbVillageoisMax];
	}
	public String getNom() {
		return nom;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public void ajouterHabitant(Gaulois habitant) {
		if(nbVillageois<NbVillageoisMax) {
			villageois[this.nbVillageois] = habitant;
			nbVillageois+=1;
		}
	}
	public Gaulois trouverHabitant(int num) {
		return villageois[num];
	}
	public void afficherVillageois() {
		System.out.println("Dans " + this.nom + " de " + this.chef.getNom() + " il y a :");
		for (int i = 0; i < this.nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		/*On essaye d'accéder à l'indice 30 d'un tableau de taille 30,
		* les indices vont donc de 0 à 29 et l'indice 30 n'existe pas.*/
		Chef Abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(Abraracourcix);
		Gaulois Astérix = new Gaulois("Astérix",6);
		village.ajouterHabitant(Astérix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		/*Astérix est à l'indice 0 (soit le premier) du tableau, par consequent
		 * il n'y a rien à l'indice 1. */
		Gaulois Obélix = new Gaulois("Obélix",25);
		village.ajouterHabitant(Obélix);
		village.afficherVillageois();
	}
}
