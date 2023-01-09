package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		Pen p1=new Pen("blue",10);
		Pen p2=new Pen("blue",10);
		System.out.println(p1.equals(p2));
		Set<Pen> p =new HashSet<>();
		p.add(p1);
		p.add(p2);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p);
		
	}
	
	 
	public static class Pen{
		int price; 
		String color;
		Pen(String color ,int price){
			this.color=color;
			this.price= price;
			}
		@Override
		public boolean equals(Object obj) {
			Pen that = (Pen) obj;
			boolean isequal = this.color.equals(that.color)  && this.price == that.price;
			return isequal;
		} 
		@Override
		public int hashCode() {
			
			return price+color.hashCode();
			
		}
	}

}
