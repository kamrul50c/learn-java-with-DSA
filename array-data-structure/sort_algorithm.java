import java.util.*;

public class sort_algorithm {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int array[]={5,2,10,2,0,4,6};
        // call
        counting_sort(array);
       // insertion_sort(array);
      //  selection_sort(array);
        // print 
        out(array);
        

    }

    public static void counting_sort(int array[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            max=Math.max(max,array[i]);
        }
        int count_array[]=new int[max+1];
        for(int i=0; i<array.length; i++){
            count_array[array[i]]+=1;
        }
        int index=0;
        
        for(int i=0; i<count_array.length; i++){
            
            while(count_array[i]>=1){
                array[index]=i;
                count_array[i]--;
                index++;
            }
        }
    }

    // public static void insertion_sort(int array[]){
    //     for(int i=1; i<array.length; i++){
    //         int current=array[i];
    //         int previous=i-1;
    //         // finding the position to insert 
    //         while(previous>=0 && array[previous]>current){
    //             array[previous+1]=array[previous];
    //             previous--;
    //         }
    //          // insert
    //          array[previous+1]=current;
    //     }
        
    // }
    // public static void buble_sort(int array[]){
    //     for(int i=0; i<array.length; i++){
    //         for(int j=0; j<array.length-1; j++){
    //             if(array[j]>array[j+1]){
    //                 int temp=array[j];
    //                 array[j]=array[j+1];
    //                 array[j+1]=temp;

    //             }
    //         }
    //     }
    // }
    // public static void selection_sort(int array[]){
       
    //     for(int i=0; i<array.length-1; i++){
    //         int min_pos=i;
    //         for(int j=i+1;j<array.length; j++){
    //             if(array[min_pos]>array[j]){
    //                 min_pos=j;
    //             }

    //         }
    //          int temp=array[i];
    //             array[i]=array[min_pos];
    //             array[min_pos]=temp;

    //     }
   // }
   
  
    public static void out(int array[]){
        int n=array.length;
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
      
    }
}