package user;

interface m1{
	void c1();
}
interface m2{
	void c1();
}
class meet implements m2,m1{
	public void c1() {
		System.out.println("hey i am interface of m1");
	}
//	public void c1() {
//		System.out.println("hey i am interface of m2");
//	}
}
public class Inheritance {
	public static void main(String[] args) {
		meet m = new meet();
		m.c1();
	}

}
