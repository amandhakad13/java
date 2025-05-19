class University {
	static class Department {
		void displayInfo() {
			System.out.println("Name = IT");
			System.out.println("Faculty members = 4");
		}
	}
}

class Test2 {
	public static void main(String[] args) {
		University.Department d = new University.Department();
		
		d.displayInfo();
	}
}