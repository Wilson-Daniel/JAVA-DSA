package Loops;

public class ForLoop {

	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for (int j =1;j<=10;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		for(int j = 1; j<=5 ; j++) {
			if(j%2==0) {
				for (int i = 10 ; i>=1 ; i--){
					System.out.print(i +" ");
				}
				System.out.println();
				System.out.println();
			}else {
				for (int i=1;i<=10;i++) {
					System.out.print(i+" ");
					}
					System.out.println();
					System.out.println();
				}
			
			}
	}

}
