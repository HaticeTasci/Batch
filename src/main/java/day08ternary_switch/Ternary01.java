package day08ternary_switch;

public class Ternary01 {

//Example 1: Type code to select the minimum one of two integers

    public static void main(String[] args) {

        int a= 34;
        int b= 5;

        //1.way:
        if(a<b){
            System.out.println("a is minimum");
        }else{
            System.out.println("b is minimum");
        }
        //2.way:

        int r1= a < b ? a : b;
        System.out.println("Minimum value is: " + r1);

        //Example 2: Type code to calculate absolute value of an integer
        //  5  ==> 5     -  0 ==> 0      -5 ==> -1 * -5==> 5

        int c= 0;
        int r2 = c<0 ? -1*c : c;
        System.out.println("Absolute value is: " + r2);

        //Example 3:If two integers are positive return the multiplication
        //         Otherwise, give a message like "I do not know how to multiply"
        //         3 and 4  ==> 12   -   -3  and -4 =>"I do not know how to multiply"

        int d= -3;
        int e= -4;

        Object r3= d>0 && e>0 ? d*e : "I do not know how to multiply";

        System.out.println(r3);

    }

}
