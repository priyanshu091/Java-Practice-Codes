import java.util.Scanner;

public class NumberGuessDoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Guess Checker");
        System.out.println("Guess the Number taken by CPU");

        int cpuNum=5;

        if(isGuessed(cpuNum)){
            System.out.println("The Guessed number is Correct");
        }


        }
        public static boolean isGuessed(int cpuNum){
        Scanner input=new Scanner(System.in);
        int userNum;
            do {
                System.out.println("Enter Your Number");
                userNum = input.nextInt();

                if (userNum!=cpuNum){
                    System.out.println("You Guessed Wrong Number");
                }
            }while(userNum!=cpuNum);

        return true;
        }
    }

