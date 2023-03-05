package string;
import java.util.Scanner;

public class PrintAllChar {
	public static void PrintAllTheString(String alpha) {
		for (int i = 0; i < alpha.length(); i++){
			System.out.println(alpha.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the all alpha");
		Scanner s = new Scanner(System.in);
		String alpha = s.nextLine();
		PrintAllTheString(alpha);
	}

}
