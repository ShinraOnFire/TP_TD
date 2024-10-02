package ex1;

public class Fou extends Piece{

	public static final char type= 'f';

	public Fou(boolean white) {
		super(white);
	}
	
	@Override
	public char getSymbol() {
		return type;
	}

	@Override
	public boolean accepts(Direction dir) {
		return dir.isDiagonal();
	}

}
