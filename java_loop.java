import java.util.*;
public class java_loop {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);


        // print star 
        int n=sc.nextInt();
        int i=1;

        while(i<=n){

            for(int j=1; j<=i; j++){

                System.out.print("*");

            }
            i++;
            System.out.println();
        }

    }
    
}
