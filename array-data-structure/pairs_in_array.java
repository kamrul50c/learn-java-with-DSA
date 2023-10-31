import java.util.*;

public class pairs_in_array {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int box[]=new int [size];
    //input

    array_input(box);

    //calll
   int total_pair= pair_inarray(box);
   System.out.println(total_pair);



   }
        public static void array_input(int array[]){
        Scanner input=new Scanner(System.in);

        for(int i=0; i<array.length; i++){
            array[i]=input.nextInt();

        }
    }
   
    public static int  pair_inarray(int array[]){
        int total_pair=0;
   
        for(int i=0; i<array.length; i++){

            for(int j=(i+1);j<array.length; j++){

                System.out.print(array[i]+","+array[j]+" ");
                total_pair+=1;
            }
            System.out.println(  );
        }
        return total_pair;
    }
}