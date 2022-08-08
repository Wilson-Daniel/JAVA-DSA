package Loops;

public class IfWithBreak {

	public static void main(String[] args) {
		for(int i =1 ; i<=40 ;i++) {
			if(i>10 && i<30) {
				System.out.println("!!!!!Putted to Execute!!!!!");
				continue;
			}else {
				System.out.println(i);
			}
		}

	}

}
