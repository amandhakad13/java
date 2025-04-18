class Student {
	int rollNo;
	String name;
	int age;
	String course;
	
	Student(int rollNo, String name, int age, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public void display() {
		System.out.println("Roll no = "+this.rollNo);
		System.out.println("Name = "+this.name);
		System.out.println("age = "+this.age);
		System.out.println("course = "+this.course);
	}
}

class Teacher {
	int id;
	String name;
	String department;
	String subject;
	
	Teacher(int id, String name, String department, String subject) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.subject = subject;
	}
	
	public void display() {
		System.out.println("Id = "+this.id);
		System.out.println("Name = "+this.name);
		System.out.println("Department = "+this.department);
		System.out.println("Subject = "+this.subject);
	}
}

public class Test4 {
	public static void main(String[] args) {
		Student s = new Student(1, "Sumit", 18, "Btech");
		Teacher t = new Teacher(101, "Vijay", "IT", "DSA");
		
		System.out.println("----- Student Data -----");
		s.display();
		System.out.println("----- Faculty Data -----");
		t.display();
	}
} 