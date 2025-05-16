
import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num:");
        int number = input.nextInt();
        System.out.println(isPrime(number));

    }
    public static boolean isPrime(int num){

        for (int i = 2; i <num; i++) {

            if (num%i == 0){
                System.out.println("Its not a Prime Num");
                return false;
            }

        }
            if (num==1){
                System.out.println("Prime nhi hai Laude");
                return false;
            }

        System.out.println("Prime hai");
        return true;
    }
}
