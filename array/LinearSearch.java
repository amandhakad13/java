import java.util.Scanner;

class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[20];
		int index = -1, target, len;
		
		System.out.print("Enter the size of array : ");
		len = sc.nextInt();
		
		System.out.println("Enter the element of array : ");
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the search element : ");
		target = sc.nextInt();
		
		for(int i=0; i<len; i++) {
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		
		if(index == -1)
			System.out.print("Element not found");
		else
			System.out.print("Element found at index : "+index);
	}
}