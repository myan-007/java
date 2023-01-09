package thread;
class Myclass1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("hey buddy");
	
		}
	}
}
	
	
class Myclass2 extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("hey bro");
		}
	}
}

public class Usingclass {

	public static void main(String[] args) {
		Myclass1 m = new Myclass1();
		Myclass2 n = new Myclass2();
		m.start();n.start();
	}

}
