import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        System.out.println("LCm Checker");
int a;
int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num 1:");
        a=input.nextInt();
        System.out.println("Enter Num 2:");
        b= input.nextInt();

        System.out.println(LCM(a,b));

    }
    public static int LCM(int a, int b){


        int i;
        for ( i = 2; i <=a*b; i++) {

            if(i%a==0 && i%b==0){

                break;
            }

        }
        return i;
    }
}