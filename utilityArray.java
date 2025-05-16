import java.util.Scanner;

public class utilityArray {
    public static int[] inputArray() {


    Scanner input = new Scanner(System.in);
        System.out.println("How many elements You want in your Array:");
    int length = input.nextInt();
    int [] array = new int[length];
        System.out.println("length of array is"+array.length);
        System.out.println("Enter elements one by one :");


        int index=0;
        while(index<array.length) {
            System.out.println("Enter the element " + (index + 1));
            array[index] = input.nextInt();
            index++;
        }
        return array;
    }

    public static void DisplayArray(int[] NumArray){

        int index=0;
        while(index<NumArray.length){

            System.out.print(" "+NumArray[index]);
            index++;
        }

    }
    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many Rows and Columns you want in your Array");
        System.out.print("Rows:");
        int Rows= input.nextInt();
        System.out.print("Columns");
        int Columns= input.nextInt();

        int[][] Array2D = new int[Rows][Columns];

        int indexRows=0;


        while(indexRows<Rows){
            int indexColumns=0;

            while(indexColumns<Columns){
                System.out.println("Enter the element for " +(indexRows+1)+" Row and "+(indexColumns+1)+" Column :");
                Array2D[indexRows][indexColumns]=input.nextInt();
                indexColumns++;
            }
            indexRows++;
        }
        return Array2D;
    }

    public static void Display2DArray( int[][] numArray){

        int rowsIndex=0;

        while(rowsIndex<numArray.length){

            int columnIndex=0;
            while(columnIndex<numArray[rowsIndex].length){

                System.out.print("Element of "+(rowsIndex+1)+" Row and "+(columnIndex+1)+" Columns is:");
                System.out.println(numArray[rowsIndex][columnIndex]+" ");
                columnIndex++;
            }
            rowsIndex++;
        }

    }
    public static void Display2dArrayMatrix(int[][] numArray){

        int rowsIndex=0;
        while(rowsIndex<numArray.length){

            int columnIndex=0;
            while(columnIndex<numArray[rowsIndex].length){

                System.out.print(numArray[rowsIndex][columnIndex]+" ");

                columnIndex++;
            }
            System.out.println();

            rowsIndex++;
        }
    }
    public static int length2dArray(int[][] numArray){

        int length=0;
        int rowsIndex=0;
        while(rowsIndex<numArray.length){
            int columnIndex=0;
            while (columnIndex<numArray[rowsIndex].length){



                columnIndex++;

            }
            length=length+numArray[rowsIndex].length;

            rowsIndex++;
        }

        return length;
    }
}
