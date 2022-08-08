package Strings;

public class GFGReversingthevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "practicevbeeaio";
		int n = s.length();
		
		System.out.println(n);
        String vov = "";
        String cust = "";
        for(int i=0 ; i<n ; i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
            	String b = String.valueOf(s.charAt(i));
                vov+=b;
                s=s.replace(s.charAt(i),'.');
            }
        }
        
        System.out.println(vov);
        System.out.println(s);
        
        int N = vov.length();
        int Z =N-1;
        System.out.println(N);
        System.out.println(Z);
        for(int i=0 ; i<n ; i++){
            if(s.charAt(i) == '.'){
                cust+=String.valueOf(vov.charAt(Z));
                Z--;
            }else{
                cust+=String.valueOf(s.charAt(i));
            }
            
        }
        System.out.println(cust);

	}

}
