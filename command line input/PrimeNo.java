class PrimeNo {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		System.out.print("Prime no are : ");
		for(int num=1; num<=n; num++) {
			if(num < 2)
				continue;
			boolean isPrime = true;
			for(int i=2; i<num; i++) {
				if(num%i==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.print(num+" ");
		}
	}
}