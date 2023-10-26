import java.util.*;
public class java_loop {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);


        // print star 
        // int n=sc.nextInt();
        // int i=1;

        // while(i<=n){

        //     for(int j=1; j<=i; j++){

        //         System.out.print("*");

        //     }
        //     i++;
        //     System.out.println();
        // }

         // print inverted star 
        // int n=sc.nextInt();
        // int i=1;

        // while(i<=n){

        //     for(int j=1; j<=n; j++){

        //         System.out.print("*");

        //     }
        //     n--;
        //     System.out.println();
        // }


        // print prime number 

        int n=sc.nextInt();
        int i=2;
        

        while(i<=n){

           boolean isprime=true;

            for(int j=2; j<i; ++j){

                 

                if(i % j == 0){

                    isprime=false;
                         break;
                }

            }
        if(isprime){  
         System.out.print("  "+ i);
        }
            
         ++i;
        }

        


    }
    
}
