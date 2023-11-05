import java.util.*;

public class sort_algorithm {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int array[]={5,3,9,2,0,4,6};
        // call
        buble_sort(array);
        // print 
        out(array);

    }
    public static void buble_sort(int array[]){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }
    }
   
  
    public static void out(int array[]){
        int n=array.length;
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
        System.err.println();
        n--;
    }
}