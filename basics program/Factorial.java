class Factorial {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int mul = 1;
		
		for(int i=num; i>1; i--) {
			mul = mul*i;
		}
		
		System.out.println(mul);
	}
}