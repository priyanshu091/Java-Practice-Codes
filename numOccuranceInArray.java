import java.sql.SQLOutput;
import java.util.Scanner;

public class numOccuranceInArray {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
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

        System.out.println("Which Num's Occurance You want to find :");
        int value= input.nextInt();
        int kitneBaarAaya=Occurance(Array,value);
        System.out.println("this number Occurs "+kitneBaarAaya+" times");

    }
    public static int Occurance(int[] Array,int value ){
        int Occurance=0;
        int index=0;
        while (index<Array.length){

            if(value==Array[index]){
                Occurance=Occurance+1;
            }

            index++;
        }

        return Occurance;
    }
}