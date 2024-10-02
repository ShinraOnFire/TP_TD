package ex5;

import java.util.Random;

public class Personnage {

	private String nom;
	private Informations etatInitial, etatActuel;

	public Personnage(String nom, Informations etatIni, Informations etatActuel) {
		this.nom = nom;
		this.etatInitial = etatIni;
		this.etatActuel = etatActuel;
	}

	public String toString() {
		return "Le personnage s'appelle : " + this.nom + ". Voici son état : " + this.etatActuel.toString();
	}
	
	public boolean estVivant() {
		return this.etatActuel.getVitalite() > 0;
	}
	
	public void rebirth() {
		this.etatActuel = new Informations(this.etatInitial);
	}
	
	public void attaque(Personnage def) {
		Random rand = new Random();
		int n = rand.nextInt(Math.max(1,this.etatActuel.getForce() - def.getEtatActuel().getForce())) + 1;
		System.out.println("rand n = " + n);
		if(this.etatActuel.getAgilite() > def.getEtatActuel().getAgilite()) {
			def.getEtatActuel().setVitalite(def.getEtatActuel().getVitalite() - n);	
		}
		else {
			def.getEtatActuel().setVitalite(def.getEtatActuel().getVitalite() - (n / 2));	
			def.getEtatActuel().setAgilite((int) Math.floor(def.getEtatActuel().getAgilite() * 2.0/3));
		}
	
	}
	
	public void lutte(Personnage p2) {
		boolean tour = false;
		System.out.println("Présentation des deux combattants.");
		System.out.println("Premier combattant, " + this.toString());
		System.out.println("Second combattant, " + p2.toString());
		while(this.estVivant() && p2.estVivant()) {
			
			
			if(tour) {
				p2.attaque(this);
			}else {
				this.attaque(p2);
			}
			
			System.out.println(this.toString());
			System.out.println(p2.toString());
			
			
			tour = !tour;
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Informations getEtatInitial() {
		return etatInitial;
	}

	public void setEtatInitial(Informations etatInitial) {
		this.etatInitial = etatInitial;
	}

	public Informations getEtatActuel() {
		return etatActuel;
	}

	public void setEtatActuel(Informations etatActuel) {
		this.etatActuel = etatActuel;
	}
	
	
}
