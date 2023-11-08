import java.util.*;
public class Two_D_array {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int array[][]=new int [m][n];
        input(array);
        //
      //  out(array);

      /*The array.length property returns the number of rows in the array. The array[0].length property returns the number of columns in the first row of the array */

        //
        transpose_matrix(array);
    


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
     public static void out(int array[][]){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose_matrix(int array[][]){
        int tr_arr[][]=new int[array[0].length][array.length];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                tr_arr[j][i]=array[i][j];
            }
        }
        out(tr_arr);
        
    }
}