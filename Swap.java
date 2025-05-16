import java.sql.SQLOutput;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter A:");

        int a = input.nextInt();

        System.out.print("Enter B:");
        int b= input.nextInt();


        int c=a;
        a=b;
        b=c;

        System.out.println("a:"+a+" b:"+b);
        //System.out.println("Value of a is:"+a+"\nValue of b is:"+b);
    }
}
