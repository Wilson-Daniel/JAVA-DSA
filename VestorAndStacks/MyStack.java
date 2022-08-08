package VestorAndStacks;


import LinkedList.MakingOwnLinkedList;

public class MyStack <E>{
	private MakingOwnLinkedList<E> ll = new MakingOwnLinkedList<>();
	
	void push(E e) {
		ll.add(e);
	}
	
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Popping From An Empty Stack ");
		}
		return ll.removeLast();
	}
	
	E peek() throws Exception{ 
		if(ll.isEmpty()) {
			throw new Exception("Peeking From An Empty Stack ");
		}
		return ll.getLast();
	}

}
