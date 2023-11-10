import java .util.*;
public class alaboutString {

     public static void main(String args[]){
        char ch[]={'s','a','i','m','o','n'};
        String st="saimon";
        String st_1=new String("saimon");

        // string are immutable//
        Scanner sc=new Scanner(System.in);

        String name,fullname;
        name=sc.next();
        /*Scanner class in Java leaves the newline character in the input buffer after the next() method is called. This can cause problems when the nextLine() method is called next, as it will read the newline character as a new line, resulting in an empty string being assigned to the variable.

The solution is to consume the newline character before calling the 
nextLine() method. */
        sc.nextLine();
        fullname=sc.nextLine();


     //   System.out.println(fullname.length());
         // concation

     //    System.out.println("hello "+name);

        // charatmethod(fullname);
         

// string_compare(fullname,st_1);
//System.out.println(substring(fullname, 1, 4));
// sub string built in function
  System.out.println(fullname.substring(1, 5));

        
        
     }

     public static void charatmethod(String st){
          for(int i=0; i<st.length(); i++){
               System.out.print(st.charAt(i)+" ");
          }
     }

     public static void string_compare(String st ,String st1){
          if(st.equals(st1)){
               System.out.println("string are equal");
          }else{
               System.out.println("string are not equal");
          }
     }

     public static String substring(String st, int si, int ei){
          String subStr="";
          for(int i=si; i<ei; i++){
               subStr+=st.charAt(i);
          }
          return subStr;
     }
}
