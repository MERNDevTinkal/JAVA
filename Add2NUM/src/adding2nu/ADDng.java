package adding2nu;
import java.util.Scanner;
public class ADDng {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int num1 = input.nextInt();

	        System.out.print("Enter second number: ");
	        float num2 = input.nextFloat();

	        float sum = num1 + num2;

	        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

	       
	}

}
