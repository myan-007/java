package coh;


class base{

	base(){
		System.out.println("i am a constructor of base with no argument");
	}
	base(int x){
		System.out.println("i am a constructor of base with x as a argument :"+x);
	}
	
}
class derived extends base{
	public derived() {
		System.out.println("i am a constructor of derived with no argument");
	}
	public derived(int x,int y) {
		super(x);
		System.out.println("i am a constructor of derived with y as a argument :"+y);
	}
	public derived(int x) {
		System.out.println("i am a constructor of derived with x argument :"+x);
	}
	
}
class childofderived extends derived{
	public childofderived() {
		System.out.println("i am a constructor of childofderived with no argument");
	}
	public childofderived(int x,int y,int z) {
		super(x,y);
		System.out.println("i am a constructor of childofderived with z argument :"+z);
	}
	
}

public class Inheritace {

	public static void main(String[] args) {
		
		childofderived g = new childofderived(2,3,4);
		
	}

}
