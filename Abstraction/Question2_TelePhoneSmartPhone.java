package Abstraction;


abstract class TelePhone{
	abstract String[] ring();
	abstract void lift();
	abstract void disconnect();
}

class SmartPhone extends TelePhone{
	//java.util.Scanner sc  = new java.util.Scanner(System.in);
	public String[] ring() {
		String[] list = {"Ravan","XMen","MArvel"};
		
		return list;
	}
	public void lift() {
		System.out.println("Call Is Coming..");
	}
	public void disconnect() {
		System.out.println("Disconnecting...");
	}
	public void camera() {
		System.out.println("Taking Photos...");
	}
	public void music() {
		System.out.println("Playing Music...");
	}
	public void callNumber(int phoneNumber) {
		System.out.println("Calling"+phoneNumber);
	}
}

interface TvRemote{
	void play();
	void pause();
		
}
interface SmartTvRemote extends TvRemote{
	void Connect();
	void Internet();
}
class SuperSmartRemote implements SmartTvRemote {
	public void play(){
		System.out.println("Playing");
	}
	public void pause() {
		System.out.println("Paused");
	}
	public void Connect() {
		System.out.println("Connecting To Another Device....");
	}
	public void Internet() {
		System.out.println("Connecting To Internet....");
	}
}
public class Question2_TelePhoneSmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SmartPhone RealMe = new SmartPhone();
//		RealMe.ring();
//		TelePhone Tell = new SmartPhone();
//		System.out.println(Tell.ring());
//		Tell.disconnect();
		SuperSmartRemote AVX = new SuperSmartRemote();
		AVX.play();
	}

}
