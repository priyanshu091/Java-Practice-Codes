import java.util.Scanner;

public class MaxArrayForEach {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Maximum Array Element Finder");
      int[] Arr=ArrayUtility.inputArr();

      ArrayUtility.displayArr(Arr);

        System.out.println("Max Value is "+MaxArr(Arr));
        }

        public static int MaxArr(int[] Arr){
            int max=Integer.MIN_VALUE;
        for(int num:Arr){

            if (num>max){
                max=num;
            }
        }

    return max;
    }
    }

