class StringMethods {
	public static void main(String[] args) {
		String s1 = "Technology";
		String s2 = "OSOP";
		String s3 = "Technology";
		
		char ch1 = s1.charAt(5);
		System.out.println("Char at index 5 = "+ch1);
		
		String lower = s2.toLowerCase();
		System.out.println("Lower case is : "+lower);
		
		String upper = s2.toUpperCase();
		System.out.println("Lower case is : "+upper);
		
		boolean isEqual = s1.equals(s3);
		System.out.println("String is equla : "+isEqual);
		
		boolean isEqual1 = s1.equals(s2);
		System.out.println("String is equla : "+isEqual1);
	}
}