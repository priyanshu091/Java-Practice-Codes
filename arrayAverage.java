import java.util.Scanner;

public class arrayAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Average Calc Using Array\n");
        System.out.println("enter No. of elements you want");
        int length= input.nextInt();

        int[] average= new int[length];

        System.out.println("length of Array is "+average.length);
        int index=0;
        System.out.println("Enter each Element and press Enter");
        while(index<average.length){
            average[index]=input.nextInt();
            index++;
        }
        int sum=SOT(average);

        float Average=Average(sum,average.length);

        System.out.println("Average is "+Average);





    }
    public static int SOT(int[] average){
        int sum=0;
        int index=0;
        while(index<average.length){
            sum=sum+average[index];

            index ++;
        }

                return sum;
    }
    public static float Average(float sumofterm,float length){
        float Average =sumofterm/length;
        return Average;
    }

}
