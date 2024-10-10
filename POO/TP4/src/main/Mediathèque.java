package main;

import java.util.ArrayList;

public class Mediathèque {
	
	private ArrayList<Media> bdd;
	
	public Mediathèque() {
		bdd.clear();
	}
	
	public void ajouter(Media doc) {
		if(!bdd.contains(doc)) {
			int i=0;
			Media tmp;
			do {
				tmp = bdd.get(i);
				if(tmp == null) bdd.add(doc);
				else if(tmp.getNumero() < doc.getNumero()) {
					bdd.add(i, doc);
				}
				i++;
			}while(tmp != null);
		}
	}
	
	public String toString() {
		String result = "";
		int i=0;
		return result;
	}
	
	public static void main(String[] args) {
		
	}
}
