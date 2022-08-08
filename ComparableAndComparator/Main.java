package ComparableAndComparator;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> student = new ArrayList<>();
		student.add(new Students(23 , "Ram"));
		student.add(new Students(35 , "Shivam"));
		student.add(new Students(83 , "Aman"));
		student.add(new Students(13 , "Ram"));
		student.add(new Students(65 , "Anuj"));
		
		Collections.sort(student, new Comparator<Students>(){

			@Override
			public int compare(Students o1, Students o2) {
				// TODO Auto-generated method stub
				if(o1.name.equals(o2.name)){
					return o1.marks - o2.marks;
				}else {
					return o1.name.compareTo(o2.name);
				}
			}
		});
		student.forEach(System.out::println);
	}

}
//class SortByNameThenMarks implements Comparator<Students>{
//	public int compare(Students o1 , Students o2) {
//		if(o1.name.equals(o2.name)){
//			return o1.marks - o2.marks;
//		}else {
//			return o1.name.compareTo(o2.name);
//		}
//	}
//}
