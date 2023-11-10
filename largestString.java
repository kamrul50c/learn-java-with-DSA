public class largestString {

    public static void main(String args[]){


        String []starr={"hablu","bablu","dablu","zazlu"};
        System.out.println(Stcom(starr));
    }
    public static String Stcom(String st[]){
        String large=st[0];
        for(int i=1; i<st.length; i++){
            if(st[i].compareToIgnoreCase(large)>0){
                large=st[i];
            }
        }
        return large;
    }
}