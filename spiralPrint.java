public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        
        int n=matrix.length;
        int m=0;
        if(n>0){

            m=matrix[0].length;
        }
        int sr=0,  er=n-1,  sc=0,  ec=m-1;
        int i;
        while(sr<=er && sc<=ec){

            //prints left to right
            for(i=sc; i<=ec; i++){

                System.out.print(matrix[sr][i]+" ");
            }
                sr++;
            //top to bottom
            for(i=sr;i<=er;i++){

                System.out.print(matrix[i][ec]+" ");
            }
                ec--;  
                      
            //right to left
            if(sr<=er){

            for(i=ec;i>=sc;i--){

                System.out.print(matrix[er][i]+" ");
            }
                er--;
            }

            //bottom to up
            if(sc<=ec){

            for( i=er;i>=sr;i--){

                System.out.print(matrix[i][sc]+" ");
            }
                sc++;
            }
		}
	}
}
