package collectionframework;



public class MyArrayDeque<E> {

	Node<E> head,rear;
	
	public void addfirst(E t) {
		Node<E> toadd =new Node<>(t); 
		if(head == null) {
			head = toadd;
			rear = toadd;
			return;
		}
		head.prev =toadd;
		toadd.next=head;
		head=head.prev;
	}
	
	
	public E removelast() {
		if(head==null)
		{
			return null;
			
		}
		Node<E> temp=rear;
		if(rear==null) head=null;
		rear=rear.prev;
		rear.next=null;
		return temp.element;
	}
	
	
	public E removefirst() {
		if(head==null)
		{
			return null;
		}
		Node<E> temp=head;
		
		head = head.next;
		head.prev=null;
		if(head==null) rear=null;
		return temp.element;
	}
	
	
	public void print() {
		Node<E> temp =head;
		while(temp!=null) {
			System.out.print(temp.element+" ");
			
			temp=temp.next;  
		}
		System.out.println();
	}
	
	public void addLast(E t) {
		Node<E> toadd =new Node<>(t); 
		if(head==null || rear==null) {
			head = toadd;
			rear = toadd;
			return;
		}
		rear.next=toadd;
		toadd.prev=rear;
		rear=rear.next;
	}
	
	
	public static class Node<E>{
		E element;
		Node<E> next,prev;
		public Node(E element){
			this.element= element;
			next = prev = null;
			}
	}
	
	
}
