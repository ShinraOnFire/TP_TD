package ex1;

public class Echiquier {

	private Piece[][] contenu;
	private int size;
	
	public Echiquier(int nbr) {
		this.size = 6 * nbr;
		contenu = new Piece[size][size];
		this.remplir(nbr);
		
	}
	
	public Piece getPiece(Position pos) {
		return this.contenu[pos.i][pos.j];
	}
	
	public void setPiece(Position pos, Piece p) {
		this.contenu[pos.i][pos.j] = p;
	}
	
	public boolean isEmpty(Position pos) {
		return this.contenu[pos.i][pos.j] == null;
	}
	
	public void erase(Position pos) {
		this.contenu[pos.i][pos.j] = null;
	}
	
	public String toString() {
		String result = "";
		for (int i=0 ; i < size ; i++) {
			for(int j=0 ; j < size ; j++) {
				if(this.isEmpty(new Position(i, j))) result += ". ";
				else result += this.getPiece(new Position(i, j)).toString() + " ";
			}
			result += "\n";
		}
		return result;
	}
	
	public void remplir(int nbr) {
		for (int k = 0; k < 3; k++) {
		    int i = k * nbr;
		    int j = this.size - k * nbr - 1;

		    while (i < (k + 1) * nbr && j > this.size - (k + 1) * nbr - 1) {
		        this.setPiece(new Position(0, i), Piece.pieces[0][k]);
		        this.setPiece(new Position(0, j), Piece.pieces[0][k]);
		        this.setPiece(new Position(this.size - 1, i), Piece.pieces[1][k]);
		        this.setPiece(new Position(this.size - 1, j), Piece.pieces[1][k]);
		        i++;
		        j--;
		    }
		}
		
		/*
		 * 
		 *   J'ai obtenu cette fonction remplir en factorisant le
		 *   code que j'ai fait en dessous et en ajoutant simplement
		 *   le bas de l'échiquier.
		 * 
		 * 
		 */
		
//		int i=0, j = this.size - 1;
//		while(i < nbr && j > this.size - nbr - 1) {
//			this.setPiece(new Position(0, i), Piece.pieces[0][0]);
//			this.setPiece(new Position(0, j), Piece.pieces[0][0]);
//			i++; 
//			j--;
//		}
//		
//		while(i < 2 * nbr && j > this.size - 2 * nbr - 1) {
//			this.setPiece(new Position(0, i), Piece.pieces[0][1]);
//			this.setPiece(new Position(0, j), Piece.pieces[0][1]);
//			i++; 
//			j--;
//		}
//		
//		while(i < 3 * nbr && j > this.size - 3 * nbr - 1) {
//			this.setPiece(new Position(0, i), Piece.pieces[0][2]);
//			this.setPiece(new Position(0, j), Piece.pieces[0][2]);
//			i++; 
//			j--;
//		}
		
	}
	
	public boolean dansPlateau(Position pos) {
		return (pos.i >= 0 && pos.j >= 0 && pos.i < this.size && pos.j < this.size);
	}
	
	public boolean canMove(Position pos, Direction dir, int dist) {
		if(pos == null || dir == null || dist == 0) return false; //objets null ou distance à 0 qui est du surplace
		if(!dansPlateau(pos)) return false; //position hors de l'échiquier
		if(isEmpty(pos)) return false; //position où il y a aucun pion
		if(!contenu[pos.i][pos.j].accepts(dir)) return false; //si le pion ne peut pas se deplacer dans cette direction
		if(!dansPlateau(pos.next(dir, dist))) return false; //si la case d'arrivée est hors du plateau
		//si la case d'arrivée est non vide et que la case d'arrivée contient un pion de la même couleur
		if((!isEmpty(pos.next(dir, dist)) && getPiece(pos.next(dir, dist)).sameColor(contenu[pos.i][pos.j]))) return false;
		//on teste si les cases entre celle de départ et celle d'arrivée sont vides
		//on commence à i=1 car si dist=1 on veut pas tester si le pion va sur une case vide ou sur un pion ennemi
		for(int i=1 ; i < dist ; i++) {
			if(!isEmpty(pos.next(dir))) return false;
		}
		return true;
	}
	
	public boolean move(Position pos, Direction dir, int dist) {
		if(!canMove(pos, dir, dist)) return false;
		if(isEmpty(pos.next(dir, dist))) {
			//si la case est vide alors on lui donne la référence de notre pion
			contenu[pos.next(dir, dist).i][pos.next(dir, dist).j] = contenu[pos.i][pos.j];
			//puis on supprime notre pion à sa position initial
			erase(pos);
			//on retourne faux car il a capturé aucun pion adverse
			return false;
		}
		contenu[pos.next(dir, dist).i][pos.next(dir, dist).j] = contenu[pos.i][pos.j];
		erase(pos);
		//on retourne true car il a capturé un pion adverse
		return true;
	}
	
	
	 
	
	public static void main(String[] args) {
		Echiquier e1 = new Echiquier(2);
		System.out.println(e1.toString());
	}
}
