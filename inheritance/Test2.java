class Super2 {
	private int a;
	private int b;
	
	Super2() {
		this.a = a;
		this.b = b;
	}
	
	void display() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

class Sub2 extends Super2 {
	
}

class Test2 {
	public static void main(String[] args) {
		Sub2 s = new Sub2();
		s.a = 10;
		s.b = 20;
		
		s.display();
	}
}