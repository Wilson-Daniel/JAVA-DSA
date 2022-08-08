package ConditionalStatements;
import java.util.Scanner;

public class IfElse {
	static void friends() {
		System.out.println("F");
	}
	static void SomeoneSpecial() {
		System.out.println("S");
	}
	static void ArmourMyGoodVibes() {
		System.out.println("A");
	}
	public static void main(String[] args) {
//	Scanner abc = new Scanner(System.in);
//	int bB = abc.nextInt();
//	if(bB<10){
//		System.out.println("NO. IS LESS THAN 10!!!");
//	}else if (bB>10 && bB<=20){
//		System.out.println("NO.IS GREATER THAN 10 AND LESS THAN 20!!!!");
//	}else if (bB>20 && bB<=30)
//		System.out.println("NO.IS GREATER THAN 20 AND LESS THAN 30");
//	else {
//		System.out.println("NO.IS GREATER THAN 30");
//	}
//	Scanner ny = new Scanner(System.in);
//	int a = ny.nextInt();
//	int b = ny.nextInt();
//	int maxOfNumber = a>b? a:b;
//	System.out.println("Greater no. is "+ maxOfNumber);
//	
//		Scanner sc = new Scanner(System.in);
//		char grade = sc.nextLong();
//		
//		if(grade=='A') {
//			System.out.println("YOU ARE GOOD");
//		}else if (grade=='B') {
//			System.out.println("YOU ARE NICE");
//		}else if(grade=='D') {
//			System.out.println("YOU HAVE TO IMPROVE ");
//		}else {
//			System.out.println("INVALID GRADE");
//		}
		
//		char grade = 'E';
//		switch(grade) {
//		case 'A':
//			System.out.println("EXCELLENT");
//			break;
//		case 'B':
//			System.out.println("VERY GOOD");
//			break;
//		case 'C':
//			System.out.println("GOOD");
//			break;
//		case 'D':
//			System.out.println("OUTSTANDING");
//			break;
//		default:
//			System.out.println("WRONG ARGUMENT");
//			break;
//		}
		Scanner sc = new Scanner(System.in);
		String life = sc.nextLine();
		switch (life) {
		case "HarderTimes":
			ArmourMyGoodVibes();
			break;
		case "HappierDays":
			friends();
			SomeoneSpecial();
			break;
		
			
		}

}

}
