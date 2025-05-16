import java.util.Scanner;

public class StarByLoop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=input.nextInt();
        pattern1(n);
    }
    public static void pattern1(int n){
        int rows=0;
        while(rows <= n){

            System.out.println();
            rows++;
            for (int star = rows; star <=n; star++) {
                System.out.print("* ");

            }
        }
    }
}
