import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArr() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Length of Array");
        int[] Arr = new int[input.nextInt()];
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " Element:");
            Arr[i] = input.nextInt();
        }
        return Arr;
    }
    public static void displayArr(int[] Arr){

        for(int nums: Arr){
            System.out.print(nums+" ");

        }
        System.out.println();
    }
   }
