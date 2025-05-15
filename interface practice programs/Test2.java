interface Animal {
	void bark();
}

class Dog implements Animal {
	public void bark() {
		System.out.println("Dog is barking");
	} 
}

class Test2 {
	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.bark();
	}
}