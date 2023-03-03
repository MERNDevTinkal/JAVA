package if_else;
import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		int rem = number%2;
		if(rem==0) {
			System.out.println("numberis even");
			return;
		}
		System.out.println("numberis odd");

	}

}
