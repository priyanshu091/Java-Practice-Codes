public class DiagonalSum2DArray {
    public static void main(String[] args) {

        System.out.println("Welcome to Array Diagonal Element's Sum Calculator:");
        int[][] numArray = utilityArray.input2DArray();

        int finalSum=diagonalSum2D(numArray);
        System.out.println("Final Sum Of Both Diagonal Elements Will be:"+finalSum);
    }
    public static int diagonalSum2D(int[][] numArray){
if (numArray.length != numArray[0].length){
    System.out.println("Only Square Matrix is Allowed");
    return 0;
}
        int sumTopLeftToBottomRight=0;
        int sumTopRightToBottomLeft=0;

        int rowsIndex=0;
        int columnIndex=0;
        while(rowsIndex<numArray.length){


            sumTopLeftToBottomRight+=numArray[rowsIndex][columnIndex];

            columnIndex++;
            rowsIndex++;
        }
        System.out.println("Sum from Top Left to Bottom Right is "+sumTopLeftToBottomRight);
int skip=0;
        int rowsIndex2=0;
        int columnIndex2=(numArray[rowsIndex2].length-1);
        while(rowsIndex2<numArray.length){

//                       the below line is to skip most center or middle element from counting twice as it repeats 2 times
                        if (rowsIndex2==columnIndex2){
                            skip = numArray[rowsIndex2][columnIndex2];
                        }
            sumTopRightToBottomLeft+=numArray[rowsIndex2][columnIndex2];
            columnIndex2--;
            rowsIndex2++;
        }
        System.out.println("Sum From top Right to Bottom Left is : "+sumTopRightToBottomLeft);

        int finalSum=sumTopLeftToBottomRight+sumTopRightToBottomLeft-skip;

        return finalSum;
    }
}
