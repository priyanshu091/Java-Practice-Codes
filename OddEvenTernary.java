import java.util.Scanner;

public class OddEvenTernary {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Even Odd Checker");
        System.out.println("Enter the number :");
        int num = input.nextInt();

        String result = num%2==0 ? " Even " : " Odd ";
        System.out.println("The Number is "+result);
    }

}
