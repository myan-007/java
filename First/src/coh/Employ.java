package coh;

class employee{
	String name;
	int salary;
	
	void getname() {
		System.out.println(name);
	}
	void getsalary() {
		System.out.println(salary);
	}
	void setname(String desiredname) {
		name=desiredname;
	}
	
	
}


public class Employ {
	public static void main(String[] args) {
		employee e1 = new employee();
		
		e1.setname("meet");
		e1.salary=6000;
		e1.getname();
		e1.getsalary();
		e1.setname("meet kachhadiya");
		e1.getname();
		
	}
}
