import java.util.Scanner;

class ReverseOfArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[20];
		int start, end, len, temp;
		
		System.out.print("Enter the size of array : ");
		len = sc.nextInt();
		
		System.out.println("Enter the element of array : ");
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		start=0;
		end=len-1;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		System.out.print("Reverse of array is : ");
		for(int i=0; i<len; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}