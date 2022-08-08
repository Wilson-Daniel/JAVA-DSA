package Strings;

public class GFGUpperCaseConversion {

	public static void main(String[] args) {
		String s ="i love programming ln";
		int n = s.length();
        String news = "";
        String na = "";
        na = String.valueOf(s.charAt(0));
        news+=na.toUpperCase();
        for(int i=1; i<=n-1 ; i++){
        
            if(s.charAt(i) == ' ' && s.charAt(i+1) !=' '){
                na = String.valueOf(s.charAt(i+1));
                news+=String.valueOf(s.charAt(i));
                news+=na.toUpperCase();
                i++;
            }else{
                news+=s.charAt(i);
            }
            
            
        }
        
        System.out.println(news);

	}

}
