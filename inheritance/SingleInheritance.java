class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void bark() {
		System.out.println(name+"is Barking.");
	}
}

class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	
	public void eat() {
		System.out.println(name+"is Eating.");
	}
} 

public class SingleInheritance {
	public static void main(String[] args) {
		Dog d1 = new Dog("Buddy");
		
		d1.bark();
		d1.eat();
	}
}