import java.util.Scanner;

class Test4 {

	void test(int num1, int num2) throws ArithmeticException {
		try {
			int div = num1/num2;
			System.out.println(num1+" / "+num2+" = "+div);
		}
		finally {
			System.out.println("Program End");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test4 t = new Test4();
		
		System.out.print("Enter number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2 : ");
		int num2 = sc.nextInt();
		
		try {
			t.test(num1, num2);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}