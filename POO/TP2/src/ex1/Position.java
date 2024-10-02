package ex1;

public class Position {
	public final int i, j;
	
	public Position(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public Position next(Direction dir, int dist) {
		//on renvoit le resultat de la position actuelle + le nombre de fois qu'il veut aller dans une direction
		return new Position(i + (dir.di * dist), j + (dir.dj * dist));
	}
	
	public Position next(Direction dir) {
		//on se deplace qu'une fois dans la direction
		return this.next(dir, 1);
	}
	
	
}
