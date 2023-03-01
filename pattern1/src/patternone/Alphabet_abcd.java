package patternone;
import java.util.Scanner;

public class Alphabet_abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d = new Scanner(System.in);
		int n = d.nextInt() ;
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=n) {
				System.out.print((char)('A'+j-1));
				j++;
			}
			System.out.println();
			i++;

	}

}
}