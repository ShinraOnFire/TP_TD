package ex4;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Vous avez fait " + question(5) + " erreurs.");
		int n = 10;
		System.out.println("\n\nVotre note est de " + evaluation(n) + "/" + n + ".");
	}
	
	public static int question(int maxTentatives) {
		int i;
		Random rd = new Random();
		int nb1 = rd.nextInt(9) + 1;
		int nb2 = rd.nextInt(9) + 1;
		for (i=0 ; i < maxTentatives ; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Donnez le resultat de la multiplication de " + nb1 + " avec " + nb2 + " : ");
			int rep = sc.nextInt();
			if(rep == nb1 * nb2) {
				System.out.println("Réponse correct !");
				break;
			}
			System.out.println("Mauvaise réponse...");
		}
		return i;
	}
	
	public static int evaluation(int n) {
		int note = n;
		for(int i=0 ; i < n ; i++) {
			note -= question(1);
		}
		return note;
	}
	
	
}
