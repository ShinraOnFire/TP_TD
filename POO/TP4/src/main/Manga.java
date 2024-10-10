package main;

public class Manga extends BandeDessinee{

	private final boolean sensInverse;
	
	public Manga(String titre, String auteur, int nombrePages, String dessinateur) {
		super(titre, auteur, nombrePages, dessinateur);
		this.sensInverse = true;
	}
	
	public String toString() {
		return super.toString() + " Manga : " + this.sensInverse;
	}
	
	public boolean isSensInverse() {
		return this.sensInverse;
	}

}
