package filehandling.activitylogger;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActivityLoggerApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int chosen=0 ;
        boolean loginStatus=false;
        try( FileWriter fw=new FileWriter("src/filehandling/activitylogger/app_activity.log",true)) {


        while(chosen!=4) {

            System.out.println("Choose From Menu:");
            System.out.println("1. Login\n" +
                    "2. Logout\n" +
                    "3. View Log File\n" +
                    "4. Exit");
            chosen = input.nextInt();

            switch (chosen){
                case 1:
                   if (loginStatus==false) {
                       fw.write("User Logged In\n");
                       fw.flush();
                       loginStatus=true;
                       break;
                   }else {
                       System.out.println("Please Logout First, then try to Log in Again");
                       break;
                   }
                case 2:
                    if (loginStatus==true){
                        fw.write("User Logged Out\n");
                        fw.flush();
                        loginStatus=false;
                        break;

                    }else {
                        System.out.println("Please Login First, then try to Logut Again");
                        break;
                    }
                case 3:{
                    System.out.println("Showing Log File:\n\n\n");
                    try(FileReader fr = new FileReader("src/filehandling/activitylogger/app_activity.log")){

                        int ch=0;
                        System.out.println("---------File Started Here---------");
                        while((ch= fr.read())!=-1){


                            System.out.print((char)ch);
                        }
                        System.out.println("--------File Ended Here--------");
                    }catch (IOException e){
                        System.out.println("Error Occured While Reading File:"+e.getMessage());
                    }
                break;}
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    }catch (IOException e){
            System.out.println("Error Occured While Writing File:"+e.getMessage());
        }finally {
            input.close();
        }
    }
}
