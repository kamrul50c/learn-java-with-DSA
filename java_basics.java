import java.util.*;                          // import liberary for input
public class java_basics{
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);   // scanner object;
        // String s=sc.nextLine();
        // System.out.println("Hello ! "+ s);



        //variable 
        // byte -1. short - 2. char -2. boolean -1. int -4. float-4. double-8 long - 8:

    //type conversion 
    int a=10;
    float b=a;


    // type casting 

    float c=10.5f;       // decimal value automatic assign as double type but using 'f' float 
    int d=(int)c;


    //type promotion     // automatically promotes small size datatype can be promoted to a large size datatype.
     
    float calculate = (float)a*c;    //type promotion and type casting


        System.out.println(calculate);
    }
}