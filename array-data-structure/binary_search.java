import java.util.*;

public class binary_search {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int box[]=new int [size];
    
        array_input(box);
        System.out.println("enter the key what for search");

        int key=sc.nextInt();

        int result=binary_search(box, key);
        if(result== -1){
            System.out.println("invalid key or input");
        }else{
       System.out.println("the key is find in  "+ result + " th index");
        }

        
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
  
    public static int binary_search(int array[], int key){
        int start=0;
        int end=(array.length-1);

        for(int i=0; i<array.length; i++){
           
            int mid=(start+end)/2;

           if(key==array[mid]){
             System.out.println("totla iteration to find number =  "+(i+1));
            return mid;
           }else if(key>array[mid]){
            start=mid+1;
           }else{
            end=mid-1;
           }

        }
        return -1;
    }
}