public class Solution {

	public static void wavePrint(int mat[][]) {
        if(mat.length==0)
            return ;
        for (int j = 0; j < mat[0].length; j++) {

            if (j % 2 == 0) {
                for (int i = 0; i <mat.length; i++) {

                    System.out.print(mat[i][j]+" ");
                }
            }
            else if (j % 2 != 0) {

                for (int i=mat.length-1; i>=0; i--) {

                    System.out.print(mat[i][j]+" ");
                }
            }
        }
	}
}
