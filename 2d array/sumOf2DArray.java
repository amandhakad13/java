import java.util.Scanner;

class sumOf2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		int row, col, sum=0;
		
		System.out.print("Enter the row : ");
		row = sc.nextInt();
		System.out.print("Enter the coloum : ");
		col = sc.nextInt();
		
		System.out.println("Enter the elements : ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				sum = sum + arr[i][j];
			}
		}
		
		System.out.print("Sum of input elements are : "+sum);
	}
}