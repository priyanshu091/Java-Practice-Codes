public class ArraySortChecker {
    public static void main(String[] args) {
        int[] numArray=utilityArray.inputArray();
        if (isSortedButDecreasing(numArray) || isSortedButIncreasing(numArray)){
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("its not Sorted");
        }

    }
    public static boolean isSortedButIncreasing(int[] numArray){

        int index =0;
//        agr hum tha current_value = 0 zero krenge to answer tb galat ayega sorting ka jb hum ek increasing order wala aary to de pr uski starting ek negative integer se ho ...to is liye current value will be equal to integer min value
        int current_integer=Integer.MIN_VALUE;
        while(index<numArray.length){


            if(numArray[index]>=current_integer){
                current_integer=numArray[index];
            }
            else{
                return false;
            }

            index++;
        }
        return true;
    }
    public static boolean isSortedButDecreasing(int[] numArray){

        int index=0;
        int currentInteger=Integer.MAX_VALUE;
        while(index<numArray.length){

            if (numArray[index]<=currentInteger){
                currentInteger=numArray[index];


            }
            else{
                return false;
            }
            index++;
        }
        return true;
    }
}
