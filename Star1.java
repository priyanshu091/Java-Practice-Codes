import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();

// Left Half Pyramid

        for (int rows = 1; rows <=n; rows++) {
            System.out.println("");


            for (int i = 1; i<=rows; i++) {
                System.out.print("* ");
            }

    }
        System.out.println();
// Right Half Pyramid
        for (int rows = 1; rows <=n; rows++) {
            System.out.println();

            for (int i = 0; i <=n-rows; i++) {
                System.out.print("* ");
            }
        }
//        Left Half Pyramid
        for (int rows = 0; rows <=n; rows++) {
            System.out.println();

            for (int spaces = 0; spaces <=(((n+1)-rows)*2)-2; spaces++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= rows; i++) {
                System.out.print("* ");
            }

        }

    }

}
