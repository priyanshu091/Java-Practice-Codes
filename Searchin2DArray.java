import java.util.Scanner;

public class Searchin2DArray {
    public static void main(String[] args) {
Scanner input= new Scanner(System.in);

       int[][] numArr= utilityArray.input2DArray();
        System.out.println("Your Entered Array is ");
       utilityArray.Display2dArrayMatrix(numArr);

        System.out.println("Enter a number you want to Search");
        int num= input.nextInt();

        isFoundin2D(numArr,num);

    }
    public static boolean isFoundin2D(int[][] numArr,int num){

        int rowsIndex=0;
        while(rowsIndex<numArr.length){
            int columnIndex=0;
            while (columnIndex<numArr[rowsIndex].length){

                if(numArr[rowsIndex][columnIndex]==num){
                    System.out.println("Number is found ");
                    return true;
                }

                columnIndex++;
            }

            rowsIndex++;
        }
        System.out.println("Number is not Found");
        return false;
    }
}
