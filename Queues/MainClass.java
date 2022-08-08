package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {

	public static void main(String[] args) {
//		Queue<Integer> q = new LinkedList<>();
//		q.add(12);
//		q.add(23);
//		q.add(34);
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.element());
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(234);
		mq.enqueue(54);
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		mq.enqueue(345);
		System.out.println(mq.peek());
		System.out.println(mq.peek());
	}

}
