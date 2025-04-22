class PrintArray1 {
	public static void main(String[] args) {
		int arr[] = {50,40,30,20,10};
		int i = 1;
		
		for(int a : arr) {
			System.out.println(i+" index of element is : "+a);
			i++;
		}
	}
}