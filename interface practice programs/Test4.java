interface Library {
	void login();
}

class Student implements Library {
	String name;
	String enrollNo;
	String password;
	
	public Student(String name, String enrollNo, String password) {
		this.name = name;
		this.enrollNo = enrollNo;
		this.password = password;
	}
	
	public void login() {
		if(enrollNo == "IT01"&&password == "1234") {
			System.out.println("Name = "+name);
			System.out.println("enrollNo = "+enrollNo);
			display();
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	
	public void display() {
		System.out.println("1  |  Java  |  James Gosling");
		System.out.println("2  |  C  |  Denis Ritchie");
		System.out.println("3  |  Python  |  Guido van Rossum");
	}
}

class Test4 {
	public static void main(String[] args) {
		Library l1 = new Student("Aman", "IT01", "1234");
		
		l1.login();
	}
}