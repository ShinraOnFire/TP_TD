package ex1;

public class Piece {

	private boolean white; // blanc true noire false
	public static final Piece[][] pieces = new Piece[2][3];
	
	static {
		pieces[0][0] = new Tour(true);
		pieces[0][1] = new Fou(true);
		pieces[0][2] = new Dame(true);
		pieces[1][0] = new Tour(false);
		pieces[1][1] = new Fou(false);
		pieces[1][2] = new Dame(false);
	}
	
	public Piece(boolean white) {
		this.white = white;
	}

	public boolean isWhite() {
		return white;
	}
	
	public boolean sameColor(Piece p) {
		return this.white == p.isWhite();
	}
	
	public char getSymbol() {
		return '0';
	}
	
	public String toString() {
		//on retourne une chaine en majuscule si la piece est blanche sinon on retourne une chaine 
		return (this.white) ? Character.toString(this.getSymbol()).toUpperCase() : Character.toString(this.getSymbol());
	}
	
	public boolean accepts(Direction dir) {
		return false;
	}
	
	
}
