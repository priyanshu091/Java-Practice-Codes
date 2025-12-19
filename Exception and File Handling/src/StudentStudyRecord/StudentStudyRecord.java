package StudentStudyRecord;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class StudentStudyRecord {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String stuName=input.nextLine();
        System.out.println("Subject Name:");
        String subName= input.nextLine();
        System.out.println("Hours Studied:");
        float hourStudied= input.nextFloat();
        LocalDate date= LocalDate.now();

try (BufferedWriter bw=new BufferedWriter(new FileWriter("Student_log.txt",true))){
    bw.write(String.format("\n Name: %s\n Subject: %s\n Hours: %.2f\n Date: %s\n ____________________________",stuName,subName,hourStudied,date ));
    bw.flush();

}catch (IOException exceptionWriting){
    System.out.printf("Exception occured in Writing "+exceptionWriting.getMessage());
}

        System.out.println("\n------File Content------\n");
try(BufferedReader br = new BufferedReader(new FileReader("Student_log.txt"))) {
//    Reading
    String line=br.readLine();

    while(line!=null){
        System.out.println(line);
        line= br.readLine();
    }

}catch (IOException exceptionReading){
    System.out.println("Exception Occurred in Reading "+exceptionReading.getMessage());
}

    }
}
