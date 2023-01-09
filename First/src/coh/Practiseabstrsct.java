package coh;

abstract class Pen{
	abstract void writing();
	abstract void refill();
}
class Fountainpen extends Pen {
	 void writing() {
		System.out.println("Writing..");
	}
	void refill() {
		System.out.println("Refilling..");
	}
	void Changenib() {
		System.out.println("Changing Nib..");
	}
}
interface Basicanimal{
	void eat();
	void sleep();
}
class Monkey{
	void jump() {
		System.out.println("Jumping..");
	}
	void bite() {
		System.out.println("Biting..");
	}
}
class Human extends Monkey implements Basicanimal{
	public void eat() {
		System.out.println("Eating..");
	}
	public void sleep() {
		System.out.println("Sleeping...");
	}
	void speak() {
		System.out.println("Speaking...");
	}
}
public class Practiseabstrsct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
