package ex5;

public class Informations {
	
	private int vitalite, force, agilite;

	public Informations(int v, int f, int a) {
		this.vitalite = v;
		this.force = f;
		this.agilite = a;
	}
	
	public Informations(Informations inf) {
		this.vitalite = inf.getVitalite();
		this.force = inf.getForce();
		this.agilite = inf.getAgilite();
	}

	public int getVitalite() {
		return vitalite;
	}

	public void setVitalite(int vitalite) {
		this.vitalite = vitalite;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getAgilite() {
		return agilite;
	}

	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}
	
	public String toString() {
		return "Vitalite : " + this.vitalite + " Force : " + this.force + " Agilite : " + this.agilite;
	}
	
	
	
}
