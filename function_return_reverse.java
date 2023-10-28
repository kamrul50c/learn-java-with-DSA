public class function_return_reverse {

    public static void main(String args[]){
        System.out.println(reverse(123));

    }
    public static int reverse(int n){
        int reverse_num=0;
       int len=(int)(Math.log10(n)+1);
        while(n>0){
            reverse_num+=(n%10)*(int)Math.pow(10,(len-1));
            n/=10;
            len--;
        }
        return reverse_num;
    }
}