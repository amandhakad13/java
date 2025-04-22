class MaxOfArray {
	public static void main(String[] args) {
		int arr[] = {10,2,34,44,57,6};
		int max = arr[0];
		
		System.out.print("Array elements are : ");
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("\nMaximum of array elements is : "+max);
	}
}