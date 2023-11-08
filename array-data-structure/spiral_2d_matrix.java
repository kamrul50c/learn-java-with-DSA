import java.util.*;
public class spiral_2d_matrix {

    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int m=sc.nextInt();
      // int array[][]=new int [n][m];
      int[][] array = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {10, 11, 12},
        {13, 14, 15},
        {16, 17, 18},
        {19, 20, 21},
        {22, 23, 24},
        {25, 26, 27},
        {28, 29, 30}
    };
    
    
    
        // call
      //  input(array);
        spiral_matrix(array);




    }

    public static void spiral_matrix(int array[][]){
      
       int start_row=0;
       int start_col=0;
       int end_row=array.length-1;
       int end_col=array[0].length-1;
       /* if i use only 1 rule (start_row<= end_row) it casues unnessary loop for large row and make error ""ArrayIndexOutOfBoundsException"" also (start_col <= end_col ) only use this condition it make unnessary loop for large column "ArrayIndexOutOfBoundsException" ********
        * **** thats why use both condition start_row <= end_row && start_col <= end_col 
        */
    while( start_row<=end_row && start_col<=end_col){
        //top
      
        for(int j=start_col; j<=end_col; j++){
            System.out.print(array[start_row][j]+" ");
            
        }
        //right
     
        for(int i=start_row+1; i<=end_row; i++){
            System.out.print(array[i][end_col]+" ");
            
        }
        //bottom
     
        for(int j=end_col-1; j>=start_col; j--){
            if(start_row == end_row ){
                break;
            }

            System.out.print(array[end_row][j]+" ");
          
        }
        //left
   
        for(int i=end_row-1; i>=start_row+1; i--){
            if(start_col==end_col){
                break;
            }
            System.out.print(array[i][start_col]+" ");
           

           
        }
         start_row++;
            start_col++;
            end_row--;
            end_col--;
       }

    }
    public static void input(int array[][]){
        Scanner input=new Scanner(System.in);
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length;j++){
                array[i][j]=input.nextInt();
            }
            System.out.println();
        }
    }
}