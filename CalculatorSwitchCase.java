import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calc");

        System.out.print("Enter Num 1: ");
        int num1= input.nextInt();

        System.out.print("Enter Num 2: ");
        int num2= input.nextInt();

        System.out.print("Which Operation You want to Use: ");
        String operation=input.next();  // yaha glti se bhi input.nextLine mt likhna Qki uska use tb krte hai jb sentences with spaces likhna ho pr yaha pr kewal ek charecter likhna hai is wjh se kewal input.Next() likhenge
        int result =switch (operation){

            case "+" ->num1 + num2;
            case "-" ->num1 - num2;
            case "*" ->num1 * num2;
            case "/" ->num1 / num2;
            default -> -1;
        };

        System.out.println("Result is "+result);

    }

}
