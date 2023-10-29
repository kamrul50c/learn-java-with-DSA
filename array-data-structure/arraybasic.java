import java.util.Scanner;

public class arraybasic {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        //array creation //
       int container[]=new int [size];
       array_input(container);
        /// array argument pass by rafarance //
        array_update(container);
       System.out.println("  ");
       array_output(container);


      
    }

    public static void array_input(int array[]){
        Scanner input=new Scanner(System.in);

        for(int i=0; i<array.length; i++){
            array[i]=input.nextInt();

        }
    }
    public static void array_output(int array[]){

        for(int i=0; i<array.length; i++){
           System.out.print( array[i]+" ");

        }
    }
  
    public static void array_update(int array[]){

        for(int i=0; i<array.length; i++){
           array[i]+=20;

        }
    }
   
}