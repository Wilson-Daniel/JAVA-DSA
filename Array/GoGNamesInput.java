package Array;

import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class GoGNamesInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("TESTS: ");
		int n = sc.nextInt();
		
		for (int i=0 ; i<n ; i++) {
			System.out.print("Enter No. Of Names: ");
			int a = sc.nextInt();
			String Arr[] = new String[a];
			int NameArr[] = new int [a];
			
			for (int j=0 ;j<a ; j++){
				System.out.println("Enter: ");
				Arr[j] = sc.next();
				NameArr[j]=Arr[j].length();
			}
			int MinInd=0;
			for(int j=0 ; j<a ; j++) {
				MinInd = NameArr[j];
				if(NameArr[j]>MinInd) {
					int temp = NameArr[j];
					NameArr[j]=MinInd;
					MinInd=temp;
				}
			}
			System.out.println(MinInd);
			
			
		}

	}

}
