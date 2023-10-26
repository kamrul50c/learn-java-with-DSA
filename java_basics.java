import java.util.*;                          // import liberary for Scanner and all
public class java_basics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);   // scanner object;
        // String s=sc.nextLine();
        // System.out.println("Hello ! "+ s);



        //variable 
        // byte -1. short - 2. char -2. boolean -1. int -4. float-4. double-8 long - 8:

    //type conversion 
    // int a=10;
    // float b=a;


    // // type casting 

    // float c=10.5;           
   // float cal=15.6f *c;        // decimal value automatic consider as double type but using 'f' float 
    // int d=(int)c;


    // //type promotion     // automatically promotes small size datatype can be promoted to a large size datatype.
     
    // float calculate = (float)a*c;    //type promotion and type casting


    //     System.out.println(calculate);

      // operator // arithmetic - //unary -relation - //logical -//assignment

    // conditional statement //if-else // switch case // ternary::

    // find large number using if else:

    int num_1=sc.nextInt();
    int num_2=sc.nextInt();
    int num_3=sc.nextInt();
    int max;
    if(num_1>num_2 && num_1>num_3){

        max=num_1;
    }else if(num_2>num_3){
        max=num_2;
    }else{
        max=num_3;
    }

System.out.println("large number is = "+max);


// calculator using switch case 

float result=0;
char ch=sc.next().charAt(0);
float a=sc.nextFloat();
float b=sc.nextFloat();


switch(ch){

    case '+':
      result=a+b;
     break;
    case '-':
      result=(a>b)?a-b:b-a;
      break;
    case '*':
      result=a*b;
      break;
    case '/':
      result=a/b;
      break;
    case '%':
      result=a%b;
      break;
    default:
      System.out.println("wrong input");
       
      }
      System.out.println(result);



// even odd using ternary operator:

int a=sc.nextInt();
String st=(a%2==0)?"even":"odd";
System.out.println(st);

  

    }
}