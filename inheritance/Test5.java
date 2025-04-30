class Area1 {
	protected int length;
	protected int breadth;
	
	Area1(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	int calculateArea() {
		return length*breadth;
	}
}

class Volume1 extends Area1 {
	protected int height;
	
	Volume1(int length, int breadth, int height) {
		super(length, breadth);
		this.height = height;
	}
	
	int calculateVolume() {
		return calculateArea()*height;
	}
}

class Density extends Volume1{
	private float mass;
	
	Density(int length, int breadth, int height, float mass) {
		super(length, breadth, height);
		this.mass = mass;
	}
	
	float calculateDensity() {
		return mass/(calculateVolume());
	}
}

public class Test5 {
	public static void main(String[] args) {
		Density d1 = new Density(10,20,30,10.50f);
		
		int area = d1.calculateArea();
		int vol = d1.calculateVolume();
		float density = d1.calculateDensity();
		
		System.out.println("Area of rectangle = "+area);
		System.out.println("Volume of rectangle = "+vol);
		System.out.println("Density = "+density);
		
	}
}