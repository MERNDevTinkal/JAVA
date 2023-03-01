package array_in_java;
import java.util.Scanner;

public class PrintUsingFunction {
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int [size];
		for(int i = 0;i<size;i++) {
			input[i]=s.nextInt();
		}
		return input;
		 
	}
	
	public static void print(int input[]) { 
		int size = input.length;
		for(int i=0;i<size;i++) {
			System.out.print(input[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeinput();
		print(arr);

	}

}
