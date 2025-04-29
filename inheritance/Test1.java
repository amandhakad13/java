class Super1 {
	int a;
	int b;
	
	Super1() {
		this.a = a;
		this.b = b;
	}
	
	void display() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

class Sub1 extends Super1 {
	
}

class Test1 {
	public static void main(String[] args) {
		Sub1 s = new Sub1();
		s.a = 10;
		s.b = 20;
		
		s.display();
	}
}