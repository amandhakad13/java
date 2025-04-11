class Employee2 {
	public int id;
	public String name;
	public int age;
	public int salary;
	
	public void display() {
		System.out.println("Name = "+id);
		System.out.println("Id = "+name);
		System.out.println("Age = "+age);
		System.out.println("salary = "+salary);
	}
}

public class Test1 {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		Employee2 e2 = new Employee2();
		e1.id = 101;
		e1.name = "Aman";
		e1.age = 18;
		e1.salary = 20000;
		e1.display();
		
		e2.id = 102;
		e2.name = "Vijay";
		e2.age = 19;
		e2.salary = 20000;
		e2.display();
	}
}