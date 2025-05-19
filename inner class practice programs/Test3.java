class Car {
	void startEngine() {
		class Engine {
			void run() {
				System.out.println("Engine is Running.");
			}
		}
		
		Engine e = new Engine();
		e.run();
	}
}

class Test3 {
	public static void main(String[] args) {
		Car c = new Car();
		c.startEngine();
	}
}