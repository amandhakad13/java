import java.util.Scanner;

class ReverseOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[20];
		int arr1[] = new int[20];
		int j=0, len;
		
		System.out.print("Enter the size of array : ");
		len = sc.nextInt();
		
		System.out.println("Enter the element of array : ");
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=len-1; i>=0; i--) {
			arr1[j] = arr[i];
			j++;
		}
		
		System.out.print("Reverse of array is : ");
		for(int i=0; i<len; i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}