import java.util.*;
public class java_function {
    public static void main(String args[]){     // main function //
        // binary to decimal using user define function:    
       System.out.println(btod(101));
   
        }

        public static int btod(int num){
            int result=0;
            int i=0;

            while(num>=1){
                
               
                 result += (num % 10)*(int)Math.pow(2, i);
                num/=10;
                ++i;
            }
            return result;
        }

}