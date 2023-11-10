import java.util.*;
public class Stringroute {

    public static void main(String args[]){
        String st="WNEENESENNN";
        System.out.println(distance(st));

    }
    public static float distance(String st){
        int x=0,y=0;
        for(int i=0; i<st.length(); i++){
            if(st.charAt(i)=='N'){
                y++;
            }else if(st.charAt(i)=='E'){
                x++;
            }else if(st.charAt(i)=='S'){
                y--;
            }else {
                x--;
            }
        }
        
    return (float)Math.sqrt((x*x)+(y*y));
    }
}