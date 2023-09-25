package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert force>=0;
		this.nom = nom;
		this.force = force;
		equipement = new Equipement[2];
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
		this.force -= forceCoup;
		if (this.force > 0) {
			parler("Aïe !");
		} else {
			parler("J'abandonne...");
		}
		assert forceInit>this.force;
	}
	public void sEquiper(Equipement equip) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le romain "+this.nom+" est déjà bien protégé !");
			break;
		case 1:
			if(equipement[0].equals(equip)) {
				System.out.println("Le romain "+this.nom+" a déjà un " + equip+".");
			}
			else {
				System.out.println("Le soldat "+this.nom+" s'équipe d'un " + equip+".");
				equipement[nbEquipement]=equip;
				nbEquipement+=1;
			}
			break;
		default:
			System.out.println("Le soldat "+this.nom+" s'équipe d'un " + equip+".");
			equipement[nbEquipement]=equip;
			nbEquipement+=1;
			break;
		}
	}
	public static void main(String[] args) {
		Romain Cesar = new Romain("Cesar",6);
		Cesar.parler("Bonjour je suis l'empereur des Romains.");
		Cesar.recevoirCoup(10);
		for(Equipement equip : Equipement.values()) {
			System.out.println(equip);
		}
		Cesar.sEquiper(Equipement.CASQUE);
		Cesar.sEquiper(Equipement.CASQUE);
		Cesar.sEquiper(Equipement.BOUCLIER);
		Cesar.sEquiper(Equipement.CASQUE);
	}
}
