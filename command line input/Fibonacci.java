class Fibonacci {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int num1=0, num2=1;
		
		System.out.print("Fibonacci series are : ");
		System.out.print(num1+" "+num2+" ");
		for(int i=2; i<n; i++) {
			int sum = num1+num2;
			System.out.print(sum+" ");
			num1 = num2;
			num2 = sum;
		}
	}
}