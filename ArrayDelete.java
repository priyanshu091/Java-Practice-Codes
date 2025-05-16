import java.util.Scanner;

public class ArrayDelete {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Array element deleter ");

        int[] numArray=utilityArray.inputArray();

        System.out.println("Enter a num you want to delete");
        int num=input.nextInt();

        int newLength= length(num,numArray);

        int[] FinalArray=Newarray_Final(numArray,num,newLength);

        System.out.println("Final Array is :");
        utilityArray.DisplayArray(FinalArray);
    }
   public static int length(int num, int[] Array) {


        int occu= numOccuranceInArray.Occurance(Array,num);

        if (occu==0){
            return Array.length;
        }
        int newlength = Array.length-occu;


        return newlength;
   }
   public static int[] Newarray_Final(int[] Array,int num,int newlength){

        int indexOfOldArray=0;
        int indexOfFinalArray=0;
        int[] FinalArray = new int[newlength];
        while(indexOfOldArray<Array.length){

            if (Array[indexOfOldArray]!=num){

                FinalArray[indexOfFinalArray]=Array[indexOfOldArray];

                indexOfFinalArray++;



            }
            indexOfOldArray++;


        }
        return FinalArray;
   }




}
