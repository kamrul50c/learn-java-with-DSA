import java.util.*;
public class java_function {
    public static void main(String args[]){     // main function //
// falculate factorial using function

System.out.println(calfac(7));

// calculate binomial coefficient formula =  n! / {r!*(n-r)!}

  Scanner sc=new Scanner(System.in);
    
  int n=sc.nextInt();
  int r=sc.nextInt();

  System.out.println(binomial_coefficient(n, r));


   

        
    }
    
    public static long calfac(int n){    /// user define function 

        long  stroge=1;

        for(int i=1; i<=n; i++){
            stroge*=i;

            
        }
        return stroge;
    }

    public static long binomial_coefficient(int a, int b){

        long fac_n=calfac(a);
        long fac_r=calfac(b);
        long fac_nmr=calfac(a-b);
        return fac_n/(fac_r*fac_nmr);

    }
}
