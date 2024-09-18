package ex2;

public class Main {
	
	public static void main (String[] args) {
		int[] t1 = {1, 3, 6, 7};
		int[] t2 = {2, 4, 6};
//		affiche(t1);
//		affiche(multiplication(t1, t2));
		affiche(split(multiplication(t1, t2)));
	}

	public static void affiche(int[] t) {
		for(int i=0 ; i < t.length ; i++) 
			System.out.println(t[i]);
	}
	
	
	public static int[] multiplication(int[] t1, int[] t2) {
		int max = Math.max(t1.length, t2.length);
		int[] t3 = new int[max];
		for(int i=0 ; i < max ; i++) {
			t3[i] = ((t1.length > i) ? t1[i] : 1) * ((t2.length > i) ? t2[i] : 1);
		}
		return t3;
	}
	
	public static int[] split(int[] t) {
		int n = 0;
		String s = "";
		for (int i=0 ; i < t.length ; i++) {
			s += String.valueOf(t[i]);
			n += String.valueOf(t[i]).length();
		}
		int[] t1 = new int[n];
		for(int i=0 ; i < n ; i++) {
			t1[i] = Character.getNumericValue(s.charAt(i));
		}
		return t1;
	}
}
