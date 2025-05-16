import java.util.Scanner;

public class arrayMaXMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter No. of elements you want");
        int length = input.nextInt();

        int[] Array = new int[length];

        System.out.println("length os Array is " + Array.length);
        int index = 0;
        System.out.println("Enter each Element and press Enter");
        while (index < Array.length) {
            Array[index] = input.nextInt();
            index++;
        }
        int max=max(Array);
        System.out.println("Maximum value in array is "+ max);
        int min=min(Array);
        System.out.println("Minimum Value in Array is"+ min);



    }


    public static int max(int[] Array){

        int index=0;
        int max=0;
        while(index < Array.length){

            if(max<Array[index]){
                max=Array[index];

            }

            index++;
        }

        return max;
    }
    public static int min(int[] Array){

        int index=0;
        int min=(max(Array));
        while(index < Array.length){

            if(min>Array[index]){
                min=Array[index];

            }

            index++;
        }

        return min;
    }
}
