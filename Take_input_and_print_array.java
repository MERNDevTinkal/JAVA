package array_in_java;
import java.util.Scanner;

public class Take_input_and_print_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int size = s.nextInt();
		int arr[] = new int [size];
		for (int i = 0; i<size;i++) {
			arr [i]= s.nextInt();
		}
		for(int i = 0 ; i<size;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();

	}

}
