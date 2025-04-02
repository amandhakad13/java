class Palindrome {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int rem,ans=0;
		int temp = n;
		
		while(temp!=0) {
			rem = temp % 10;
			ans = ans*10+rem;
			temp = temp/10;
		}
		
		if(ans == n) 
			System.out.print(n+" is Palindrome");
		else
			System.out.print(n+" is not Palindrome");
		
	}
}