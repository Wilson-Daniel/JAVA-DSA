package SingleTonClass;

public class AppConfig {
//	private AppConfig() {
//		System.out.println("Hellow World");
//	}
//	public static AppConfig obj = null;
//	public static AppConfig getInstance() {
//		if(obj==null) {
//			obj = new AppConfig();
//		}
//		return obj;
//	}
	private AppConfig(){
	}
	private static AppConfig obj = new AppConfig();
	public static AppConfig getInstance(){
		return obj;
	}
}
