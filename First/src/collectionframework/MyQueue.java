package collectionframework;

import collectionframework.MyLinkedList.Node;

public class MyQueue<E> {

	private Node<E> head,rear;
	public void enQueue(E e) {
		Node<E> toadd = new Node<>(e);
		if(head==null) {
			 head=rear=toadd; 
		}
		rear.next=toadd;
		rear=rear.next;
	}
	public E deQueue() throws Exception {
		if(head==null) {
			throw new Exception("Empty Queue");
		}
		
		Node<E> temp;
		temp=head;
		head = head.next;
		if(head==null) {
			rear = null;   
		}
		return temp.element;
	}
	
	
}
