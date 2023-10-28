import java.util.*;
public class advance_pattern {

    public static void diamond(int n){

        // 1st half 
     for(int i=1; i<=n; i++){
        //spaces  n-i 
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }

        //star odd 2*(i-)1+1
        for(int j=1; j<=2*i-1; j++){
            System.out.print("*");

            }
        
  
        
        System.out.println( );
    }
    // 2nd half
     for(int i=n; i>=1; i--){
        //spaces  n-i 
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }

        //star odd 2*(i-)1+1
        for(int j=1; j<=2*i-1; j++){
            System.out.print("*");

            }
        
  
        
        System.out.println( );
    }
     
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        diamond(row);
    }
}