import java.util.Scanner;

public class SumTwoNums {

    public static void main(String[] args) {

        System.out.print("1st num:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        System.out.print("2nd num:");
        int num2 = input.nextInt();

        int sum= num1+num2;

        System.out.println("sum is :"+sum );

    }
}