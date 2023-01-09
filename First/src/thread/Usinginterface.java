package thread;
class Myclass3 implements Runnable{
	
	public void run() {
		for (int i = 0; i < 100; i++) {
		System.out.println("kya baat he");
		}
	}
}
class Myclass4 implements Runnable{
	
	public void run() {
		for (int i = 0; i < 100; i++) {
		System.out.println("shu vaat che");
		}
	}
}
public class Usinginterface {
public static void main(String[] args) {
	Myclass3 m = new Myclass3(); 
	Myclass4 n = new Myclass4();
	Thread tm = new Thread(m);
	Thread tn = new Thread(n);
	tm.start();
	tn.start();
	
}
}
