package Strings;

public class StringInitilisation {

	public static void main(String[] args) {
		String name = "Wil2son Da4niel";
		String form = name.concat(" Is A Diffrent Boy With Unique Idea.");
		System.out.println(form);
		
		String [] allname = form.split(" ");
		
		String anotherName = new String ("Wilson Daniel");
		
		String doggi = new String ("");
		
		System.out.println(name.trim());
		String[] an = name.split("");
		String ar="";
		System.out.println(an.length);
		
		
		///System.out.println();
		for (String all : an) {
			System.out.print(all+ " " );
		}
		name.concat(ar);
		System.out.println(name);
		int value = Integer.parseInt(name);
		System.out.println("--"+value);

	}

}
