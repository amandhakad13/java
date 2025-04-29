class Super3 {
	protected int a;
	protected int b;
	
	Super3() {
		this.a = a;
		this.b = b;
	}
	
	void display() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

class Sub3 extends Super3 {
	
}

class Test3 {
	public static void main(String[] args) {
		Sub2 s = new Sub2();
		s.a = 10;
		s.b = 20;
		
		s.display();
	}
}