import java.util.*;

public class stringIsanagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String st = "ecar";
        String st1 = "care";

        if (areAnagrams(st, st1)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < str1.length(); i++) {

            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
            
            
          
            
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
   
    }
  
}
