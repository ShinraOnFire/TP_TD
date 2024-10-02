package ex5;

public class Combat {

	private Personnage p1, p2;
	private Informations i1, i2;
	
	public static void main(String[] args) {
		new Combat();
	}
	
	public Combat() {
		initClasses();
		this.p1.lutte(this.p2);
	}
	
	public void initClasses() {
		this.i1 = new Informations(10, 29, 7);
		this.i2 = new Informations(85, 5, 16);		
				
		this.p1 = new Personnage("Mario",this.i1, new Informations(this.i1));
		this.p2 = new Personnage("Luigi", this.i2, new Informations(this.i2));	
	}
}
