package user;

import collectionframework.MyQueue;

public class Ownqueue {

	public static void main(String[] args) throws Exception {
		MyQueue<Integer> q = new MyQueue<>();
		q.enQueue(898);
		q.enQueue(34);
		q.enQueue(554);
		q.enQueue(345);
		q.enQueue(48);
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}
