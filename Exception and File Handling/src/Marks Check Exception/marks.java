package in.kgcoding.exception;

import java.util.Scanner;

public class marks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks= input.nextInt();
        try{
          int result = checkMarks(marks);
            System.out.println("Marks are "+result);
        }catch (in.kgcoding.exception.InvalidMarksException exc){
            System.out.println(exc.getMessage());
            System.out.println("Please Enter Valid Marks ");
        }finally {
            System.out.println("Process Completed");
        }


    }
    public static int checkMarks (int marks) throws in.kgcoding.exception.InvalidMarksException {

        if (marks < 0 || marks > 100){
            throw new in.kgcoding.exception.InvalidMarksException("Invalid Marks Entry ");
        }

        return marks;
    }
}
