package Array;
import java.util.Scanner;
public class CreateArrays {
	
	public static void main(String[] args) {
//		 int[] marks = new int[5];
//		 System.out.println(marks[4]);
//		int[] age = {12,2,3,4,5};
//		double[] marks = {1.23,5.36,6.12342314};
//		System.out.println(age[4] );
//		System.out.println(marks[2]);
//		for (int i = 0 ; i< age.length ; i++ ) {
//			System.out.println(age[i]);
//		int [] age = new int[5];
//		int [] marks = {3,4,5,6,7};
//		int a [][] = new int[5][3];
//		int b [][] = {{1,2,3},{4,5,6},{7,8,9}};
//		System.out.println(b[1][2]);
		
//		}
//		int a =4 ;
//        int Arr[] = {1,2,3,4};
//        int sum=0;
//        
//        for(int i=0 ; i<a ;i++){
//            sum+=Arr[i];
//        }
//        System.out.println(sum);
        Student[] arr = new Student[2];
        arr[0] =new Student(13,"Wilson");
        arr[1] = new Student(23,"Max");
        for(int i=0 ; i<arr.length ; i++) {
        	System.out.println(arr[i].rollno + " "+arr[i].name);
        }
		        
	}
	

}
class Student{
	public int rollno;
	public String name;
	Student(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
}