package main;

public class LongMetrage extends Video{

	private final String realisateur;
	
	public LongMetrage(String titre, double duree, String realisateur) {
		super(titre, duree);
		this.realisateur = realisateur;
	}
	
	public String getRealisateur() {
		return this.realisateur;
	}

	public String toString() {
		return super.toString() + " Long Metrage de : " + this.realisateur;
	}
}
