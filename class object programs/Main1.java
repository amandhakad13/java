class Test {
	int num1;
	int num2;
	int num3;
	
	Test() {
	
	}
	
	Test(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public void display2() {
		System.out.println("num1 = "+this.num1);
		System.out.println("num2 = "+this.num2);
	}
	
	public void display() {
		System.out.println("num1 = "+this.num1);
		System.out.println("num2 = "+this.num2);
		System.out.println("num3 = "+this.num3);
	}
	
	public int greater2() {
		if(num1>num2)
			return num1;
		return num2;
	}
	
	public int greater3() {
		if(num1>num2 && num1>num3)
			return num1;
		else if(num2>num1 && num2>num3)
			return num2;
		else
			return num3;
	}
	
	public int sum() {
		return (num1+num2+num3);
	}	
}

public class Main1 {
	public static void main(String[] args) {
		Test t1 = new Test(10,20,30);
		t1.display2();
		t1.display();
		int max1 = t1.greater2();
		int max2 = t1.greater3();
		int s = t1.sum();
		
		System.out.println("Maximum of Two no = "+max1);
		System.out.println("Maximum of Three no = "+max2);
		System.out.println("Sum of Three no = "+s);
	}
}