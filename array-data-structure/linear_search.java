import java.util.*;

public class linear_search {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        
        int size=sc.nextInt();
        int box[]=new int [size];
    
        arr_input(box);
        System.out.println("enter the key what for search");

        int key=sc.nextInt();

        int result=lenear_search(box, key);
        if(result== -1){
            System.out.println("invalid key or input");
        }else{
       System.out.println("the key is find in  "+ result + " th index");
        }
        
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

    public static int lenear_search(int array[], int k){

        for(int i=0; i<array.length; i++){

            if(array[i]==k){

                return i+1;
                
            }
        }
        return -1;
    }
}