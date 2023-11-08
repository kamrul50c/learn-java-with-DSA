import java.util.*;
public class diogonal_sum {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int [][]array=new int[m][n];
        input(array);

        System.out.print(diogonalsum(array));

    }
    public static int diogonalsum(int array[][]){
        int sum=0; 
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(i==j){
                    sum+=array[i][j];
                }else if(i+j==(array.length-1)){
                    sum+=array[i][j];
                }
            }
        }
        return sum;
    }
    public static void input(int array[][]){
        Scanner input=new Scanner(System.in);
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                array[i][j]=input.nextInt();
            }
        }
    }
}