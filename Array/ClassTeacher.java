package Array;

import java.util.Scanner;

public class ClassTeacher {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Total No. Of Students: ");
//		int a = sc.nextInt();
//		int total = 0;
//		int[] noOfStudents = new int[a];
//		for(int i=0 ; i<noOfStudents.length ; i++) {
//			System.out.print("Enter Marks Of Student "+i+":");
//			int b =sc.nextInt();
//			noOfStudents[i]=b;
//			total  += b;
//			
//		}int average=total/a;
//		System.out.print("Average Marks Of All Students: ");
//		System.out.print(average);
//		System.out.print(noOfStudents);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Total No. Of Students: ");
//		int a = sc.nextInt();
//		int total = 0;
//		int[] marks = new int [a];
//		for (int i = 0 ; i<a ; i++) {
//			System.out.print("Enter Marks Of Student "+i+":");
//			marks[i]=sc.nextInt();
//			total += marks[i];
//		}int avg= total/a;
//		System.out.print("Average Marks Of All Students: ");
//		System.out.print(avg);
		Scanner sc = new Scanner(System.in);
		System.out.print("Total No. Of Students: ");
		int n = sc.nextInt();
		int total = 0;
		
		int[] marks = new int[n];
		
		for (int i = 0 ; i<n ; i++) {
			System.out.print("Enter Marks Of Student "+(i+1)+": ");
			marks[i]=sc.nextInt();
			total+=marks[i];
		}
		int avg = total/n;
		System.out.println("Average Marks Of All Student: "+avg);
	}

}
