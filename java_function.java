import java.util.*;
public class java_function {
    public static void main(String args[]){     // main function //
           
    inrngprime(100);
   // System.out.println(isprime(4));
        }

        public static void inrngprime(int num){

            for(int i=2; i<=num; ++i){

                if(isprime(i)){

                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

public static boolean isprime(int num){


    boolean isprime=true;
    for(int i=2; i<=Math.sqrt(num); ++i){
        if(num % i==0){
            isprime=false;
            break;
        }
    }
    return isprime;
}
        
}