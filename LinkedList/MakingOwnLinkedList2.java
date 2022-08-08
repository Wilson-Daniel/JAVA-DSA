package LinkedList;

public class MakingOwnLinkedList2 {
	Node head;
//	
	void add(int data) {
		Node toAdd = new Node(data);
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	boolean isEmpty(){
		return head == null;
	}	
	
	void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data+" ");
		    temp=temp.next;
		}
	}
//	Node head;
//	static class Node{
//		int data;
//		Node next;
//		Node(int d){
//			this.data = d;
//			next=null;
//
//		}
//	}
//	
//	void add(int d) {
//		Node toAdd = new Node(d);
//		Node temp = head;
//		while(temp.next != null) {
//			temp = temp.next;
//		}
//		temp.next = toAdd;
//	}
//	void print() {
//		while (head != null) {
//			System.out.println(head.data);
//		}
//		head = head.next;
//	}
	
	
}
