class SwapUsingBitwise {
	public static void main(String[] args) {
		int num1, num2;
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		
		System.out.print("Before Swapping : ");
		System.out.println(num1+" "+num2);
		
		num1 = num1^num2;
		num2 = num1^num2;
		num1 = num1^num2;
		
		System.out.print("After Swapping : ");
		System.out.print(num1+" "+num2);
	}
}