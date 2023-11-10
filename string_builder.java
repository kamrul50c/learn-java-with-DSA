public class string_builder {

    public static void main(String args[]){
        
       
    String st="hello this is saimon  ";
    System.out.println(convert_letter_uppper(st));
    }
    
    public static String convert_letter_uppper(String st){
         StringBuilder sb=new StringBuilder("");
         sb.append(Character.toUpperCase(st.charAt(0)));
         for(int i=1; i<st.length(); i++){
            if(st.charAt(i-1) == ' '){
               sb.append(Character.toUpperCase(st.charAt(i))); 
            }else{
                sb.append(st.charAt(i));
            }
         }
      return sb.toString();
    }
   
}