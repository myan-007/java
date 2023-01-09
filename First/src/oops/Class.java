package oops;
class cat{
	
	int age;
	String breed,name;
public void info(){
		System.out.println("My name is "+name+" and i am "+age+" years old.");
		System.out.println("My breed is "+breed+".");
	}
}
public class Class {

	public static void main(String[] args) {
		cat cat1= new cat();
		cat1.age=2;
		cat1.breed="heyman";
		cat1.name="kitty";
		cat1.info();

	}

}
