import java.util.Scanner;

class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2 : ");
		int num2 = sc.nextInt();
		
		try {
			int div = num1/num2;
			System.out.println(num1+" / "+num2+" = "+div);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero is not possible");
		}
	}
}