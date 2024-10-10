package main;

public class Video extends Media{

	private final double duree;
	
	public Video(String titre, double duree) {
		super(titre);
		this.duree = duree;
	}
	
	public double getDuree() {
		return this.duree;
	}
	
	public String toString() {
		return super.toString() + " Video : " + this.duree;
	}
	

}
