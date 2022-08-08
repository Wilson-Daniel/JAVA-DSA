package Methods;

public class PassByReference {

	public static void main(String[] args) {
//		int a = 3;
//		int b = 7;
//
//		method(a,b);
//		System.out.println(a+" "+b);
		Dog dog = new Dog();
		dog.legs=3;
		Dog dog1 = new Dog();
		dog1.legs=4;
		change(dog,dog1);
		System.out.println(dog.legs );
		
	}
	static void method(int c , int d) {
		int temp=c;
		c=d;
		d=temp;
		System.out.println(c+" "+d);
	}
	static void DogChange(Dog dog , Dog dog1) {
		Dog temp = dog;
		dog  = dog1;
		dog1 =temp;
	}
	static void change (Dog dog2 , Dog dog3 ) {
		dog2.legs = 9;
		
	}
	
	

}
class Dog{
	int legs;
}