package twoDArray;
import java.util.Scanner;

public class InputAndPrint2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the number of rows");
		int row = s.nextInt();
		System.out.println("Enter the numbers of cols");
		int cols = s.nextInt();
		int arr[][] = new int [row][cols];
		for(int i=0; i<row; i++) {
			for(int j = 0; j<cols; j++) {
				System.out.println("Enter element at "+i+" row "+"Enter element at "+j+" cols ");
				arr[i][j] = s.nextInt();
			}
			
		}
		for(int i = 0; i<row; i++) {
			for(int j=0; j<cols;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
