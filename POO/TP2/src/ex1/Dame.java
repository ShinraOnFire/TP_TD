package ex1;

public class Dame extends Piece{
	
	public static final char type= 'd';
	
	public Dame(boolean white) {
		super(white);
	}

	@Override
	public char getSymbol() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public boolean accepts(Direction dir) {
		return (dir.isAxial() || dir.isDiagonal());
	}
	
	
	

}
