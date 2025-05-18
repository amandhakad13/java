class Computer {
	
	class Processor {
		public void displayDetails() {
			System.out.println("Name = Intel Core i5");
			System.out.println("Speed = 2.5GHZ To 3.5 GHZ");
		}
	}
}

class Test1 {
	public static void main(String[] args) {
		Computer c = new Computer();
		Computer.Processor p = c.new Processor();
		p.displayDetails();
	}
}