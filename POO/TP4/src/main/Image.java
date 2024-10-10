package main;

public class Image extends Media{

	private final int hauteur;
	private final int largeur;
	
	public Image(String titre, int largeur, int hauteur) {
		super(titre);
		this.hauteur = hauteur;
		this.largeur = largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public int getLargeur() {
		return largeur;
	}
	
	public String toString() {
		return super.toString() + " Image : Hauteur : " + this.hauteur + " Largeur : " + this.largeur;
	}

	
}
