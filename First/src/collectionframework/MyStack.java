package collectionframework;

public class MyStack<E>{
	
	private MyLinkedList<E> ll = new MyLinkedList<>();
 
	void push(E e) {
		ll.add(e);
	 }
	 E pop() throws Exception {
		if(ll.isempty()) throw new Exception("Empty stack");
		return ll.removelast();
	 }
	 
	 E peek() throws Exception {
		 if(ll.isempty()) throw new Exception("Empty stack");
		 else
			 return ll.getlast();
	 }
	 public static void main(String[] args) throws Exception {
		MyStack<Integer> f = new MyStack<>();
		f.peek();
		f.push(2);
		f.push(4);
		f.push(6);
		f.push(8);
		f.push(10);
		System.out.println(f.peek());
		System.out.println(f.pop());
		System.out.println(f.peek());
	}
}
