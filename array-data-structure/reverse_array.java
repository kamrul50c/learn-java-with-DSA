import java.util.*;

public class reverse_array {

   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int box[]=new int [size];
    //input

    array_input(box);
    //reverse 
    REVERSE(box);
    //output

    System.out.println("output");
    array_output(box);


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
    public static void REVERSE(int array[]){
        int temp,start=0,end=(array.length-1);
        while(start<end){
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            ++start;
            --end;
        }
    }
}