import java.util.Scanner;

class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2 : ");
		int num2 = sc.nextInt();
		
		try {
			if(num2!=0) {
				int div = num1/num2;
				System.out.println(num1+" / "+num2+" = "+div);
			}
			else {
				throw new ArithmeticException("Division by zero is not possible");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}