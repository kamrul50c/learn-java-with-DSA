import java.util.*;

public class largestarray {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int box[]=new int [size];

        arr_input(box);
        System.out.println("large value = "+largevalue(box));

    }
     public static void arr_input(int array[] ){
        System.out.println("enter "+array.length+ " value for array");
        Scanner input=new Scanner(System.in);
        for(int i=0; i<array.length; i++){
            array[i]=input.nextInt();
        }
    }
    public static void arr_output(int array[]){
        System.out.println("output ");
        
        for(int i=0; i<array.length; i++){
           System.out.print(array[i]+" ");
        }
    }
    public static int largevalue(int array[]){

        int max=Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
         return max;
    }
   

}