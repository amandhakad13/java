class Employee {
	public int id;
	public String name;
	public int age;
	public int salary;
}

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 10;
		e1.name = "Aman";
		e1.age = 18;
		e1.salary = 20000;
		
		System.out.println("Name = "+e1.id);
		System.out.println("Id = "+e1.name);
		System.out.println("Age = "+e1.age);
		System.out.println("salary = "+e1.salary);
	}
}