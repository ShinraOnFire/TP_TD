package ex3;

public class Shift {

	
	public static void main(String[] args) {
		for(String s : args) {
			System.out.print(remplacerVoyelles(s));
			System.out.print(" ");
		}
	}
	
	public static String remplacerVoyelles(String s) {
		String resultat = "";
		String voyelles = "aeiouy"; 
		
		for (int i=0 ; i < s.length() ; i++) {
		    char c = s.charAt(i);
		    int index = voyelles.indexOf(c);  
		    
		    if (index != -1)
		        resultat += (index == 0) ? 'y' : voyelles.charAt(index - 1);
		    else
		        resultat += c;
		}
		return resultat;
	}	
}
		

	
