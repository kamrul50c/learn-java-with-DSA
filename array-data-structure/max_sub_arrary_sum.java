import java.util.*;

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
   
        for(int i=0; i<array.length; i++){

            for(int j=i;j<array.length; j++){
                int current=0;
               

                for(int k=i; k<=j; k++){
                   // System.out.print(" " +array[k]);
                    current +=array[k];


                }
                if(current>max){
                    max=current;
                }
               
            }
            
            //System.out.println(  );
        }
         return max;
    }
}