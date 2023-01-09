package begin;

public class Employee {

	
	String emp_name;
	int emp_age;
	int emp_salary;
	String emp_dsgn;
	
	public Employee(String name) {
		emp_name= name;
	}
	
	public void setAge(int age) {
		this.emp_age=age;
	}
	
	public void setSalary(int salary) {
		this.emp_salary=salary;
	}
	
	public void setDsgn(String dsgn) {
		this.emp_dsgn=dsgn;
	}

	
	public void print_employee() {
		
		System.out.println("Employee's name: "+emp_name);
		System.out.println("Employee's age: "+emp_age);
		System.out.println("Employee's salary: "+emp_salary);
		System.out.println("Employee's designation: "+emp_dsgn+'\n');
		
	}
	
	
	public static void main(String[] args) {
		
		Employee emp1 =new Employee("manoj");
		Employee emp2 =new Employee("saroj");
		
		emp1.setAge(21);
		emp1.setDsgn("manager");
		emp1.setSalary(60000);
		
		
		emp2.setAge(34);
		emp2.setDsgn("Product eng");
		emp2.setSalary(45000);
		
		
		emp1.print_employee();
		emp2.print_employee();
	}

}
