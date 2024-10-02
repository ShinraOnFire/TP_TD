package ex1;

public class Tour extends Piece{

	public static final char type= 't';

	public Tour(boolean white) {
		super(white);
	}
	
	@Override
	public char getSymbol() {
		return type;
	}

	@Override
	public boolean accepts(Direction dir) {
		return dir.isAxial();
	}

}
