package main;

public class Media {

	private final String titre;
	private static int compteur = 0;
	private final int numero;
	
	public Media(String titre) {
		this.titre = titre;
		this.numero = compteur++;
	}
	
	public String getTitre() {
		return this.titre;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String toString() {
		return "Titre : " + this.titre + " Numéro : " + this.numero;
	}
	
	public boolean plusPetit(Media doc) {
		return (this.getNumero() < doc.getNumero());
	}
}
