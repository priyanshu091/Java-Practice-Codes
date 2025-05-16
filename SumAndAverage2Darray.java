public class SumAndAverage2Darray {

    public static void main(String[] args) {
       int[][] numArr= utilityArray.input2DArray();

       int length = utilityArray.length2dArray(numArr);
        System.out.println("Length is "+ length);
       float sum= Sum(numArr);
        System.out.println("Sum is :"+sum);
       float Average= Average(numArr,sum);
        System.out.println("Average is "+Average);

    }
    public static int Sum(int[][] numArray){

        int sum=0;
        int rowsIndex=0;
        while(rowsIndex<numArray.length){
            int columnIndex=0;
            while (columnIndex<numArray[rowsIndex].length){

                sum=sum+numArray[rowsIndex][columnIndex];

                columnIndex++;

            }

             rowsIndex++;
        }
        return sum;
    }
    public static float Average(int[][] numArr,float sum){

        int length =utilityArray.length2dArray(numArr);

        float average=(sum/length);

        return average;
    }
}
