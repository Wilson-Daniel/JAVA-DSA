package LinkedList;
import java.util.*;
public class MakingOwnLinkedList<E> {
	Node<E> head;
	
	//Adding Elements
	public void add(E data) { 
		Node toAdd = new Node(data);
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	//checking For Empty List
	public boolean isEmpty() {
		return head == null;
	}
	
	//Creating a Building Block NODE
	public static class Node<E>{
		public E data;
		public Node<E> next;
		public Node(E data){
			this.data = data;
			next = null;
		}
		
	}
	//Printing Data 
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	//--------------POP FUNCTIION-----------------------------------
	public E removeLast() throws Exception{
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception("Cannot Remove LIST Is empty.");
		}
		
		if(temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return (E) toRemove.data;
		}
		while(temp.next.next != null) {
			temp=temp.next;
		}
		Node toRemove = temp.next;//taaki temp.next kho na jaye
		temp.next = null;
		return(E) toRemove.data;
	}
	//-----------------------------------------------------------------
	
	//----------------PEEK FUNCTION-----------------------------------
	public E getLast() throws Exception{
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception("Cannot PEEK LIST Is empty.");
		}
		while(temp.next != null) {
			temp=temp.next;
		}
		return(E) temp.data;
	}
	//----------------------------------------------------------------
    void get(E data){
//    	if (isEmpty()) {
//    		System.out.println("Add Some Value ");
//    		return;
//    	}
//    	Node toAdd = new Node(data);
//    	Node temp = head;
//    	System.out.println(toAdd.data);
    	//System.out.println(toAdd.data);
//		int i=0;
//		while(temp!=null) {
//			i++;
//		}
//		int array[] = new int[i];
//		for(int j=0 ; j<i ; j++) {
//			temp.data = array[i];
//			temp = temp.nextt;
//		}
//	    System.out.print(array);
//    	
    	Node<E> temp = head;
		while(temp == data) {
			temp = temp.next;
			if(temp == data) {
				System.out.print(temp.data + " ");
			}
		}
    	
	}
	
	
}
