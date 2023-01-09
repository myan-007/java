package collectionframework;

import java.util.LinkedList;

public class MyLinkedList<E> {
	
	Node<E> head;
	
	void add(E data) {
		Node<E> toadd = new Node<E>(data);
		if(isempty()) {
			head=toadd;
			return;
		}
	
		Node<E> temp = head;
//		System.out.println(temp);
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toadd;
	}
	void get(int i) {
		Node<E> temp = head;
		int t=0;
		while(t!=i) {
			temp=temp.next;
			t++;
		}
		System.out.println(temp.element);
	}
	void set(int i,E element) {
		Node<E> temp = head;
		int t=0;
		while(t!=i) {
			temp=temp.next;
			t++;
		}
		temp.element=element;
	}
	void remove(int i) {
		
		Node<E> temp1 = head;
		Node<E> temp2;
		
		int t=0;
		while(t!=(i-1)) {
			temp1=temp1.next;
			
			t++;
		}
		temp2=temp1.next;
		temp1.next=temp2.next;
		temp2=null;
		
	}
	public boolean isempty() {
		return head == null;  
	} 
	
	void print() {
		Node<E> temp =head;
		while(temp!=null) {
			System.out.print(temp.element+" ");
			
			temp=temp.next;  
		}
		System.out.println();
	}
	E getlast() {
		Node<E> temp =head;
		while(temp.next != null) {
			temp=temp.next;  
		}
		return temp.element;
	}
	
	
	
	
	E removelast() {
		Node<E> temp =head;
		Node<E> toremove;
		if(temp.next== null) {
			toremove=head;
			head=null;
			return toremove.element;
		}
		while(temp.next.next != null) {
			temp=temp.next;  
		}
		toremove = temp.next;
		temp.next=null;
		return toremove.element;
	}
	public static class Node<E>{
		E element;
		Node<E> next;
		public Node(E element1) {
			this.element=element1;
			this.next=null;
		}
	}
	public static void main(String[] args) {
		MyLinkedList<Integer> l =new MyLinkedList<>();
		LinkedList<Integer> m = new LinkedList<>();
		m.get(0);
		l.add(4);
		l.add(3);
		l.add(4);
		l.add(8);
		l.add(9);
//		System.out.println(l.isempty());
//		
		l.print();
		l.remove(2);
		l.set(0,  7);
		l.print();
		
	}
	
}

