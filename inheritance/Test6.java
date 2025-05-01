class Person {
	protected int id;
	protected String name;
	protected int age;
	protected int mobileNo;
	
	Person(int id, String name, int age, int mobileNo) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	
	void display() {
		System.out.println("Id = "+this.id);
		System.out.println("Name = "+this.name);
		System.out.println("age = "+this.age);
		System.out.println("MobileNo = "+this.mobileNo);
	}
}

class Student extends Person{
	private String className;
	private String subject;
	
	Student(int id, String name, int age, int mobileNo, String className, String subject) {
		super(id, name, age, mobileNo);
		this.className = className;
		this.subject = subject;
	}
	
	void display() {
		System.out.println("Id = "+super.id);
		System.out.println("Name = "+super.name);
		System.out.println("age = "+super.age);
		System.out.println("MobileNo = "+super.mobileNo);
		System.out.println("Class = "+this.className);
		System.out.println("Subject = "+this.subject);
	}
}

class Employee extends Person {
	private int salary;
	private String degree;
	private String post;
	
	Employee(int id, String name, int age, int mobileNo, int salary, String degree, String post) {
		super(id, name, age, mobileNo);
		this.salary = salary;
		this.degree = degree;
		this.post = post;
	}
	
	void display() {
		System.out.println("Id = "+super.id);
		System.out.println("Name = "+super.name);
		System.out.println("age = "+super.age);
		System.out.println("MobileNo = "+super.mobileNo);
		System.out.println("Salary = "+this.salary);
		System.out.println("Degree = "+this.degree);
		System.out.println("Post = "+this.post);
	}
} 

public class Test6 {
	public static void main(String[] args) {
		Person p1 = new Student(1,"Rahul Kumar", 20, 62676458, "12th", "PCM");
		Person p2 = new Employee(2,"Rohit Kumar", 25, 63686559, 20000, "Btech", "Java Developer");
		p1.display();
		p2.display();
		
	}
}