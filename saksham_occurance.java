import java.util.Scanner;

public class saksham_occurance {
    public static void main(String[] args) {
       int [] arr = utilityArray.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.println("enter a element:");

        int num = input.nextInt();
        int occu = occurrence(num, arr);
        System.out.println("no. is found "+ occu + " times");

    }
    public static int occurrence(int num, int[] arr){
        int index = 0;
        int occu = 0;
        while(index < arr.length){
            if(arr[index] == num) {
            occu = occu+1;


            }



            index++;

        }


        return occu;
    }
}
