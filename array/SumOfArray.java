class SumOfArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int sum = 0;
		
		System.out.print("Array elements are : ");
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		
		System.out.println("\nSum of array elements is : "+sum);
	}
}