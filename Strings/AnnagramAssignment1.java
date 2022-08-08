package Strings;

public class AnnagramAssignment1 {

	public static void main(String[] args) {
		String a = "I love , Java the Coffee     and                 more" ;
		int b = a.length();
		String all[]=a.split(" ");
		
		
		int n = 0;
		for(String ab : all) {
			String trims = ab.trim();
			if (trims != "") {
				n++;						
			}
		}
		String fina[] = new String[n];
		for(String ab : all) {
			String trims = ab.trim();
			if (trims != "") {
				fina[n-1]= trims;
				n--;
			}
		}
		System.out.println("");
		for(String bc : fina) {
			System.out.print(bc+" ");
		}
	
			
		
		

	}

}
