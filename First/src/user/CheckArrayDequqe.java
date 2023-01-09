package user;

import collectionframework.MyArrayDeque;

public class CheckArrayDequqe {

	public static void main(String[] args) {
		MyArrayDeque<Integer> d =new MyArrayDeque<>();
		d.addfirst(79);
		d.addfirst(56);
//		d.print();
		d.addLast(934);
		d.addLast(656);
		d.print();
		System.out.println(d.removelast());
		System.out.println(d.removefirst());
//		d.print();
	}

}
