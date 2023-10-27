import java.util.*;
public class advance_pattern {

    public static void pattern(int row, int col){

        for(int i=1; i<=row; i++){

            for(int j=1; j<=col; j++){

                if(i==1 || j==1 || i==row || j==col){

                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.err.println( );
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        pattern(row,col);


    }
}