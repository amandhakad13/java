import java.util.Scanner;

class MultiplicationOf2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] mul = new int[5][5];
		int[][] arr1 = new int[5][5];
		int[][] arr2 = new int[5][5];
		int row1, col1, row2, col2;
		
		System.out.print("Enter the row of array 1 : ");
		row1 = sc.nextInt();
		System.out.print("Enter the coloum of array 1 : ");
		col1 = sc.nextInt();
		System.out.print("Enter the row of array 2 : ");
		row2 = sc.nextInt();
		System.out.print("Enter the coloum of array 2 : ");
		col2 = sc.nextInt();
		
		System.out.println("Enter the elements of array 1 : ");
		for(int i=0; i<row1; i++) {
			for(int j=0; j<col1; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of array 2 : ");
		for(int i=0; i<row2; i++) {
			for(int j=0; j<col2; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<row1; i++) {
			for(int j=0; j<col1; j++) {
				mul[i][j] = arr1[i][j]*arr2[i][j];
			}
		}
		
		System.out.println("Multiplication of 2 array elements are :");
		for(int i=0; i<row1; i++) {
			for(int j=0; j<col1; j++) {
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
	}
}