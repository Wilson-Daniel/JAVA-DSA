package Sets;
import java.util.*;
public class IntroSets {

	public static void main(String[] args) {
		
//		Set<String> fruits = new HashSet<>();
//		fruits.add("Kiwi");
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Banana");
//		System.out.println(fruits);
		Set<Integer> x = new HashSet<>();
		x.add(34);
		x.add(9);
		x.add(4);
		
		Set<Integer> y = new HashSet<>();
		y.add(45);
		y.add(9);
		y.add(89);
		
		x.addAll(y);
		System.out.println(x);

	}

}
