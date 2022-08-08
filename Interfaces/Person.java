package interfaces;

public class Person implements Student ,YouTuber {

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		
	}
	@Override
	public void study() {
		System.out.println("Person is Studing ");
	}
	@Override 
	public void makeVideo() {
		System.out.println("Person is making a Good Video");
	}
	@Override
	public void editVideo() {
		// TODO Auto-generated method stub
	}

}
