import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sum of digits calculator:");
        int a= input.nextInt();
        System.out.println(sumofdigits(a));
}
      public static int sumofdigits(int num){
        int sum=0;
        while(num>0){
            int last_digit =(num%10);
            sum=sum + last_digit;
            num=num/10;
        }

    return sum;}
}
