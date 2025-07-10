import java.util.Scanner;

public class MinimumTernary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Minimum Int Checker");

        System.out.println("Enter first Num :");
        int a= input.nextInt();
        System.out.println("Enter Second Num:");
        int b= input.nextInt();

        MinimumTernary ternary = new MinimumTernary(); //2) here we created object of class with name
                                                        //"ternary"
        System.out.println(ternary.minInt(a,b)+" is the Minimum Integer"); //3)Then we access(use) that object(ternary) to use function of minimum because here method is non-static and psvm is static so we can't access not static function in static method
    }
    public  int minInt(int num1,int num2){ //1) lets try here without making static method

        int min=num1<num2 ? num1 :num2;


        return min;
    }

}
