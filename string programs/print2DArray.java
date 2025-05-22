import java.util.Scanner;

class print2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		int row, col;
		
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
		
		System.out.println("Input elements are :");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}