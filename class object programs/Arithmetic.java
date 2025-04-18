class Calculator {
	public int num1;
	public float num2;
	
	public float add() {
		return num1+num2;
	}
	public float sub() {
		return num1-num2;
	}
	public float mul() {
		return num1*num2;
	}
	public float div() {
		return num1/num2;
	}
	public float max() {
		if(num1>num2)
			return num1;
		return num2;
	}
}

public class Arithmetic {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.num1 = 10;
		c.num2 = 5;
		
		float add = c.add();
		float sub = c.sub();
		float mul = c.mul();
		float div = c.div();
		float max = c.max();
		System.out.println("Addition of "+c.num1+" and "+c.num2+" is : "+add);
		System.out.println("Substraction of "+c.num1+" and "+c.num2+" is : "+sub);
		System.out.println("Multiplication of "+c.num1+" and "+c.num2+" is : "+mul);
		System.out.println("Division of "+c.num1+" and "+c.num2+" is : "+div);
		System.out.println("Maximum of "+c.num1+" and "+c.num2+" is : "+max);
	}
}