import java.util.*;
public class advance_pattern {

    public static void hollw_rhombus(int n){

        // 1st half 
     for(int i=1; i<=n; i++){
        //star  i 
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            if(j==1 || j==n || i==1 ||i== n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
  
        
        System.out.println( );
    }
     
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        hollw_rhombus(row);
    }
}