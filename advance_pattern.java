import java.util.*;
public class advance_pattern {

    public static void butterfly_pattern(int n){

        // 1st half 
     for(int i=1; i<=n; i++){
        //star  i 
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        //star  2*(n-i)
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        //star  i
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println( );
     } 

     // 2nd half // mirror
     for(int i=n; i>=1; i--){
        //star  i 
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        //star  2*(n-i)
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        //star  i
        
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println( );
     } 
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        butterfly_pattern(row);
    }
}