import java .util.*;
public class String_compression {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(string_compres(st));
    }
    public static String string_compres(String st){
        StringBuilder sb=new StringBuilder("");
        
        for(int i=0; i<st.length(); i++){
            int counter=1;
            while(i<st.length()-1 && st.charAt(i) == st.charAt(i+1)){
                counter++;
                i++;
            } 
            sb.append(st.charAt(i)); 
            if(counter>1){
                sb.append(counter);
            }
        }
        return sb.toString();
    }
}