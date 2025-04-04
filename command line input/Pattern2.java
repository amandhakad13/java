class Pattern2 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		for(int i=n; i>=1; i--) {
			for(int j=i; j>1; j--){
				System.out.print("  ");
			}
			for(int k=i; k<=n; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}