package main;

public class BandeDessinee extends Livre{

	private final String dessinateur;
	
	public BandeDessinee(String titre, String auteur, int nombrePages, String dessinateur) {
		super(titre, auteur, nombrePages);
		this.dessinateur = dessinateur;
	}
	
	public String toString() {
		return super.toString() + " Bande Dessinée : " + this.dessinateur;
	}
	
	public String getDessinateur() {
		return this.dessinateur;
	}
}
