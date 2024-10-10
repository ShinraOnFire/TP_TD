package main;

public class Livre extends Media {

	private final String auteur;
	private final int nombrePages;
	
	public Livre(String titre, String auteur, int nombrePages) {
		super(titre);
		this.auteur = auteur;
		this.nombrePages = nombrePages;
	}

	public String getAuteur() {
		return auteur;
	}

	public int getNombrePages() {
		return nombrePages;
	}
	
	public String toString() {
		return super.toString() + " Livre de : " + this.auteur + " Nombre de pages : " + this.nombrePages;
	}
	
	

	
}
