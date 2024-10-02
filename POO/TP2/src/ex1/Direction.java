package ex1;

public class Direction {
	public final int di, dj;
	
	public Direction(int di, int dj) {
		this.di = di;
		this.dj = dj;
	}
	
	public boolean isAxial() {
		//retourne vrai si on se deplace sur un seul axe
		return (this.dj == 0 || this.di == 0);
	}
	
	public boolean isDiagonal() {
		//retourne vrai si on se deplace sur les deux axes en simultané
		return (this.dj != 0 && this.di != 0);
	}
	
	
	
}
