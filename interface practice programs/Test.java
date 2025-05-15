interface TestInterface {
	int A = 10;
	void display();
}

class Test implements TestInterface {
	public void display() {
		System.out.println("Overrided Successfully");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		
		t.display();
		System.out.println("A = "+t.A);
	}
}