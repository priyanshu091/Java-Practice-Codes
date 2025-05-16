import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a no." );

        int a = input.nextInt();
        System.out.println(isPallindrone(a));


    }
    public static int reversed(int num){
        int ones = (num%10);
        int tense = ((num/10)%10);
        int hundred = (num/100);

        int result = 0;
               while (num>0){
                   int lastdigit =num % 10;
                   result=(result*10)+lastdigit;
                   num=num/10;
               }

        return result;
    }
    public static boolean isPallindrone(int num){

        if (reversed(num) == num){
            System.out.println("Num is Pallindrome");
            return true;
        }
        else {
            System.out.println("Num is not pallindrome");
            return  false;
        }

    }
}