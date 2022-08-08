package Maps;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class IntroMaps {

	public static void main(String[] args) {
		
//		Map<String , Integer> numbers = new HashMap<>();
//		numbers.put("One",1);
//		numbers.put("Two",2);
//		numbers.put("Five",5);
//		System.out.println(numbers);
//		String ar2[] = {"b","d","h"};
		
//		int arr[] = {1,2,3};
//		Map<String , Integer> maps = new HashMap<>();
//		for(int i=0 ; i<3; i++) {
//			maps.put(ar2[i],arr[i]);
//		}
//		Set<Entry<String,Integer>> entries = maps.entrySet();
//        for(Entry<String,Integer> entry:entries){
//            entry.setValue(entry.getValue());
//        }
//        System.out.println(maps);
		Map<Integer,String> mp1 = new LinkedHashMap<>();
		mp1.put(1 , "Wilson");
		mp1.put(3 , "Ashish");
		mp1.put(2 , "Deepanshu");
		mp1.put(4 , "Deepali");
		Map<Integer,String> mp2 = new LinkedHashMap<>();
		mp2.put(6 , "Wilson");
		mp1.putAll(mp2);
		for(Map.Entry<Integer,String> e : mp1.entrySet()){
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}

}
