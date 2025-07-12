import java.util.Scanner;

public class PrimeCheckForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker");
        System.out.println("Enter Your Number:");
        int num= input.nextInt();

        if (isPrime(num)){
            System.out.println(num+ "  is Prime");
        }
        else{
            System.out.println(num+" is not Prime");
        }

    }
    public static boolean isPrime(int num){

        for (int i = 2; i < num; i++) {

            if (num%i==0){
                return false;
            }

        }
        return true;
    }

}
