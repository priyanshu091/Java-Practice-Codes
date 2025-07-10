import java.util.Scanner;

public class monthSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number of Month:");
        int monthNum=input.nextInt();
        String monthName =switch (monthNum){

            case 1 ->"January";
            case 2 ->"February";
            case 3 ->"March";
            case 4 ->"April";
            case 5 ->"May";
            case 6 ->"June";
            case 7 ->"July";
            case 8 ->"Aug";
            case 9 ->"Sep";
            case 10 ->"oct ";
            case 11 ->"Nov";
            case 12 ->"dec";
            default ->"Invalid";
        };

        System.out.println("You Entered "+monthNum+" and it is "+monthName);
    }
}
