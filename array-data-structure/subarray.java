import java.util.*;

public class subarray {

    

   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int box[]=new int [size];
    //input

    array_input(box);

    //calll

   
  
sub_arry(box);


   }
        public static void array_input(int array[]){
        Scanner input=new Scanner(System.in);

        for(int i=0; i<array.length; i++){
            array[i]=input.nextInt();

        }
    }
   
    public static void  sub_arry(int array[]){
        //int total_pair=0;
   
        for(int i=0; i<array.length; i++){

            for(int j=i;j<array.length; j++){
                System.out.print("[");

                for(int k=i; k<=j; k++){
                    System.out.print(" " +array[k]);

                }
                System.out.print("]");
            }
            System.out.println(  );
        }
      //  return total_pair;
    }
}