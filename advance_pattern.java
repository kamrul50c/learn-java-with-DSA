import java.util.*;
public class advance_pattern {

    public static void diamond(int n){
        int value=0;
       

        // 1st half 
     for(int i=1; i<=n; i++){
        value=i;
        //spaces  n-i 
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }

        //star odd 2*(i-)1+1
        for(int j=i; j>=1; j--){
            
             System.out.print(j);
            
            // if(j>=i){
            //     value++;
            // }else{
            //     value--;

            // }
           

            }
            for(int j=2; j<=i; j++){
            
             System.out.print(j);
            
            // if(j>=i){
            //     value++;
            // }else{
            //     value--;

            // }
           

            }
        
  
        
        System.out.println( );
        
    }
    // // 2nd half
    //  for(int i=n; i>=1; i--){
    //     //spaces  n-i 
    //     for(int j=1; j<=(n-i); j++){
    //         System.out.print(" ");
    //     }

    //     //star odd 2*(i-)1+1
    //     for(int j=1; j<=2*i-1; j++){
    //         System.out.print("*");

    //         }
        
  
        
    //     System.out.println( );
    // }
     
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        diamond(row);
    }
}