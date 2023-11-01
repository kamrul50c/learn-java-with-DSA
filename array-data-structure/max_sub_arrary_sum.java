import java.util.*;

import javax.xml.transform.stax.StAXResult;

public class max_sub_arrary_sum {


   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int box[]=new int [size];
    //input

    array_input(box);

    

    //calll

 System.out.println(max_sub_arry_sum(box));


   }
        public static void array_input(int array[]){
        Scanner input=new Scanner(System.in);

        for(int i=0; i<array.length; i++){
            array[i]=input.nextInt();

        }
    }
   
    public static int  max_sub_arry_sum(int array[]){
        int max=Integer.MIN_VALUE;
        int current=0;

        int pre_fix_sum[]=new int [array.length];
        pre_fix_sum[0]=array[0];
   
        for(int i=1; i<array.length; i++){
            pre_fix_sum[i]=pre_fix_sum[i-1]+array[i];
        }


             for(int j=0;j<array.length; j++){
                int start=j;
                
               

                 for(int k=j; k<array.length; k++){
                    int end=k;
                
                current=(start==0)?pre_fix_sum[end]:pre_fix_sum[end]-pre_fix_sum[start-1];


                }
                if(current>max){
                    max=current;
                }
               
            }
            
            //System.out.println(  );
        
        
         return max;
    }

    // public static void array_output(int array[]){
    //     for(int i=0; i<array.length; i++){

    //         System.err.print(array[i]+" ");
    //     }
    //     System.err.println();
    // }
}