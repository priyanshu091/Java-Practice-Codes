import java.util.Scanner;

public class SearchNumInArray {
    public static void main(String[] args) {

//        int[] array =new int[5];
        int[] array1={ 12, 26, 21, 11, 2, 1, 4, 65};
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        System.out.println(isFound(a,array1));
    }
    public static boolean isFound(int num,int[] array1){
        int index=0;
        while(index<array1.length){

            if (array1[index]==num){
                System.out.println("Number is Found");
                return true;
            }


            index++;
        }
        System.out.println("Number is not found");
        return false;
    }
}
