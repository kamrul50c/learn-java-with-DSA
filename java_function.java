import java.util.*;
public class java_function {
    public static void main(String args[]){     // main function //
        // binary to decimal using user define function:    
       System.out.println(decimaltobinary(13));
   
        }

        public static int decimaltobinary(int num){
            int result=0;
            int i=0;

            while(num>0){
                
               
                 result += (num % 2)*(int)Math.pow(10, i);
                num/=2;
                ++i;
            }
            return result;
        }

}