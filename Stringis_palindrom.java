import java.util.*;
public class Stringis_palindrom {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    if(ispalindrom(st)){
        System.out.println("String is palindrome");
    }else{
        System.out.println("not palindrome");
    }

 }
 public static boolean ispalindrom(String st){

    for(int i=0; i<st.length()/2; i++){
        if(st.charAt(i)!=(st.charAt(st.length()-1-i))){

            return false;
        }
    }
    return true;
 }
    
}