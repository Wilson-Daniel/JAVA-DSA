package ComparableAndComparator;

public class Students implements Comparable<Students>{
	int marks;
	String name;
	
	public Students(int marks , String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name +"]";
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Students obj) {
		return this.marks - obj.marks;
	}
	
}
