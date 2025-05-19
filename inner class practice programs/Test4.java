interface Greeting {
	void sayHello();
}

class Test4 {
	public static void main(String[] args) {
		Greeting g = new Greeting() {
				public void sayHello() {
					System.out.println("Hello! World");
				}
		};
		
		g.sayHello();
	}
}