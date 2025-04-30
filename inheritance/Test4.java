class Area {
	protected int length;
	protected int breadth;
	
	Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	int calculateArea() {
		return length*breadth;
	}
}

class Volume extends Area {
	private int height;
	
	Volume(int length, int breadth, int height) {
		super(length, breadth);
		this.height = height;
	}
	
	int calculateVolume() {
		return calculateArea()*height;
	}
}

public class Test4 {
	public static void main(String[] args) {
		Volume v1 = new Volume(10,20,30);
		
		int area = v1.calculateArea();
		int vol = v1.calculateVolume();
		
		System.out.println("Area of rectangle = "+area);
		System.out.println("Volume of rectangle = "+vol);
		
	}
}