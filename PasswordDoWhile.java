import java.util.Scanner;

public class PasswordDoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String passinput;
        String pass="0000";
        do{
            System.out.println("Enter the 4 digit pin");
            passinput= input.next();
            if (!passinput.equals(pass)){
                System.out.println("You Entered Wrong Password");
            }

        }while(!passinput.equals(pass));

        System.out.println("Unlocked");
    }

}
