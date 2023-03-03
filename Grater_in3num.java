package if_else;
import java.util.Scanner;

public class Grater_in3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n= new Scanner(System.in);
		int a = n.nextInt();
		int b = n.nextInt();
		int c= n.nextInt();
		if(a>=b && a>c ) {
			System.out.println("a is grater");
		}
		else {
			if(b>=a && b>=c)
				System.out.println("b is grater");
		
		else
		 {
			System.out.println("c is gater");
		 }
		}

	}

}
