public class ReverseArray {

    public static void main(String[] args) {

        int[] Array = utilityArray.inputArray();
        int[] Reveresed = ReversedArrray(Array);

        System.out.println("Reversed Array is :");
        utilityArray.DisplayArray(Reveresed);

    }
    public static int[] ReversedArrray(int[] oldArray){

        int[] ReversedArray= new int[oldArray.length];

        int index=0;
        while(index< oldArray.length){

            ReversedArray[(oldArray.length-index)-1]=oldArray[index];


            index++;
        }
        return ReversedArray;

    }

}
