class Test4 {
	public static void main(String[] args) {
		String s = "Java Programming";
		
		byte[] bt = s.getBytes();
		
		for(byte b : bt) {
			System.out.println(b);
		}
	}
}