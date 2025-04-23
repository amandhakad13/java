import java.util.Scanner;

class LinearSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[20];
		int temp, len;
		
		System.out.print("Enter the size of array : ");
		len = sc.nextInt();
		
		System.out.println("Enter the element of array : ");
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Befor Sorting : ");
		for(int i=0; i<len; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0; i<len-1; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("After Sorting : ");
		for(int i=0; i<len; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}