public class diogonal_sum {

    public static void main(String args[]){



        int [][]array = {{10, 20, 30},
                         {40, 50, 60},
                         {70, 80, 90}};
       
                         
        int key=70;

        search_sorting_arr(array,key);

    }
    public static void search_sorting_arr(int array[][] , int key){
     int row=0;
     int col=array[0].length-1;
     while(row<=array.length-1 && col>=0){
        if(key==array[row][col]){
            System.out.println("key is found at "+row+", "+col);
            break;
        }else if(key>array[row][col]){
            row++;
        }else {
            col--;
        }
     }
    }
  
}