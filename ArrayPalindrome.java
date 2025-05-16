public class ArrayPalindrome {


    public static void main(String[] args) {
        
        int[] numArray= utilityArray.inputArray();
        int[] Reversed= ReverseArray.ReversedArrray(numArray);
        isPallindrome(numArray,Reversed);

    }
    public static boolean isPallindrome(int[] numArray,int[] Reveresed){

        int index=0;
        while(index< numArray.length)
        if (numArray[index]==Reveresed[index]){

            index++;


        }
        else {
            System.out.println("It is not Pallindrome");
            return false;

        }

        System.out.println("It is Pallindrome");
        return true;
    }

}
