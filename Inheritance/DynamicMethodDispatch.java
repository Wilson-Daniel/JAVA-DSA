package Inheritance;

class phone{
	public void showTime() {
		System.out.println("Time Is 8 pm");
	}
	public void on() {
		System.out.println("Turning On Phone...");
	}
}
class smartPhone extends phone{
	public void music() {
		System.out.println("Playing Music");
	}
	public void on() {
		System.out.println("Turning On SmartPhone.....");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		phone obj = new phone();
		obj.showTime();
		phone obj1 = new smartPhone();
		obj1.on();
		obj1.showTime();
	}

}
