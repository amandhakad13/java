abstract class Animal {
	abstract void makeSound();
}

class Test6 {
	public static void main(String[] args) {
		
		Animal a = new Animal() {
			void makeSound() {
				System.out.println("Meow");
			}
		};
		
		a.makeSound();
	}
}