interface Shape {
	float getArea();
}

class Triangle implements Shape {
	float base;
	float height;
	
	Triangle(float base, float height) {
		this.base = base;
		this.height = height;
	}
	
	public float getArea() {
		return 1/2.0f*base*height;
	}
}

class Rectangle implements Shape {
	float length;
	float width;
	
	Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public float getArea() {
		return length*width;
	}
}

class Circle implements Shape {
	float radius;
	
	Circle(float radius) {
		this.radius = radius;
	}
	
	public float getArea() {
		return 3.14f*radius*radius;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(101, 120);
		Rectangle r1 = new Rectangle(15, 25);
		Circle c1 = new Circle(25);
		
		float triangle = t1.getArea();
		float rectangle = r1.getArea();
		float circle = c1.getArea();
		
		System.out.println("Area of triangle : "+triangle);
		System.out.println("Area of rectangle : "+rectangle);
		System.out.println("Area of circle : "+circle);
	}
}