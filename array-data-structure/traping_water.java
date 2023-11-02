import java.util.*;

public class traping_water {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int bar[]=new int [size];

        input(bar);

        System.out.println(traping_waterf(bar));
       
    }

    public static int traping_waterf(int array[]){
        int trape_water=0;

        int left_max_boundary[]=new int [array.length];
        int right_max_boundary[]=new int [array.length];
        left_max_boundary[0]=array[0];
        right_max_boundary[array.length-1]=array[array.length-1];
        for(int i=1,j=array.length-2; i<array.length; i++,j--){
            left_max_boundary[i]=Math.max(array[i], left_max_boundary[i-1]);
            right_max_boundary[j]=Math.max(array[j], right_max_boundary[j+1]);

        }
        for(int i=0; i<array.length; i++){
            trape_water+=(Math.min(left_max_boundary[i], right_max_boundary[i])-array[i]);
        }

        return trape_water;
    }
    public static void input(int array[]){
        Scanner input=new Scanner(System.in);

        for(int i=0; i<array.length; i++){
            array[i]=input.nextInt();
        }  
    }
    public static void output(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    } 
}