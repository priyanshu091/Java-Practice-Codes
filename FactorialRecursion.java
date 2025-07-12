import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Factorial Calculator:");
        System.out.println("Enter the number :");
        int num =input.nextInt();

        long fact = factorial(num);
        System.out.println("factorial is "+fact);

    }
    public static long factorial(long num){

if (num==1){
    return 1;
}

        return num*(factorial(num-1));
    }
}
