class Super {
	public int a;
	public int b;
	
	Super() {
		this.a = a;
		this.b = b;
	}
	
	void display() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

class Sub extends Super {
	
}

class Test {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.a = 10;
		s.b = 20;
		
		s.display();
	}
}