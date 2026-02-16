package Enums;/*
 * Assignment 1: Day of Week Manager
 *
 * Objective: Learn basic enum declaration, usage, and built-in methods (values(), ordinal(), name(), valueOf())
 *
 * Instructions:
 * 1. Create an enum called DayOfWeek with all 7 days (MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)
 * 2. In the main method, use values() to get all enum constants and print them
 * 3. For each day, print its ordinal() value (position in enum, starting from 0)
 * 4. Create a static method isWeekend(DayOfWeek day) that returns true if day is SATURDAY or SUNDAY
 * 5. Test the isWeekend method with SATURDAY, WEDNESDAY, and SUNDAY
 * 6. Create a static method getNextDay(DayOfWeek day) that returns the next day
 *    - Handle the wrap-around case: SUNDAY should return MONDAY
 *    - Hint: Use ordinal() and values() array
 * 7. Test getNextDay with FRIDAY and SUNDAY to show the results
 * 8. Use valueOf() method to convert the string "MONDAY" to a DayOfWeek enum constant
 * 9. Use == operator to compare two enum constants (MONDAY == MONDAY and MONDAY == FRIDAY)
 * 10. Print all results in a formatted manner
 *
 * Sample Output:
 * All days of the week:
 * MONDAY (ordinal: 0)
 * TUESDAY (ordinal: 1)
 * WEDNESDAY (ordinal: 2)
 * THURSDAY (ordinal: 3)
 * FRIDAY (ordinal: 4)
 * SATURDAY (ordinal: 5)
 * SUNDAY (ordinal: 6)
 * 
 * Weekend check:
 * Is SATURDAY a weekend? true
 * Is WEDNESDAY a weekend? false
 * Is SUNDAY a weekend? true
 * 
 * Next day calculation:
 * Day after FRIDAY: SATURDAY
 * Day after SUNDAY: MONDAY
 * 
 * String to Enum conversion:
 * Converting string "MONDAY" to enum: MONDAY
 * 
 * Enum comparison:
 * MONDAY == MONDAY: true
 * MONDAY == FRIDAY: false
 */



public class Assignment1_DayOfWeek {
    
    // TODO: Define the DayOfWeek enum here with all 7 days
     public static enum DayOfWeek{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }

    // TODO: Create a static method isWeekend(DayOfWeek day) that returns boolean
    //       Return true if day is SATURDAY or SUNDAY, false otherwise
    public static boolean isWeekend(DayOfWeek day){
        return day==DayOfWeek.SATURDAY || day==DayOfWeek.SUNDAY;
    }
    
    // TODO: Create a static method getNextDay(DayOfWeek day) that returns DayOfWeek
    //       Use ordinal() to get current position, add 1, and handle wrap-around using modulo
    //       Use values() array to get the enum at calculated position
    public static DayOfWeek getNextDay(DayOfWeek day){

        DayOfWeek[] allDays= DayOfWeek.values();

       int nextPosition = (day.ordinal()+1)% allDays.length;


         return allDays[nextPosition];
    }
    
    public static void main(String[] args) {
        

        System.out.println("All days of the week:");


        for(DayOfWeek day: DayOfWeek.values()){
            System.out.println(day.name()+" : "+ day.ordinal());
        }

        System.out.println("\nWeekend check:");
        // TODO: Test isWeekend() with SATURDAY and print result
        //       Format: "Is SATURDAY a weekend? true"

        System.out.println("Is Saturday a weekend ?"+isWeekend(DayOfWeek.SATURDAY));

        // TODO: Test isWeekend() with WEDNESDAY and print result
        System.out.println("Is Wednesday a weekend ?"+isWeekend(DayOfWeek.WEDNESDAY));


        // TODO: Test isWeekend() with SUNDAY and print result
        System.out.println("Is Sunday a weekend ?"+isWeekend(DayOfWeek.SUNDAY));



        // TODO: Print header "\nNext day calculation:"
        System.out.println("\nNext day calculation:");
        
        // TODO: Call getNextDay(FRIDAY) and print the result
        //       Format: "Day after FRIDAY: SATURDAY"

        System.out.println("Day after FRIDAY:"+getNextDay(DayOfWeek.FRIDAY));

        // TODO: Call getNextDay(SUNDAY) and print the result to show wrap-around

        System.out.println("Day after Sunday:"+getNextDay(DayOfWeek.SUNDAY));

        // TODO: Print header "\nString to Enum conversion:"
        System.out.println("\nString to Enum conversion:");


        // TODO: Use DayOfWeek.valueOf("MONDAY") to convert string to enum
        //       Store in a variable and print it
        //       Format: "Converting string \"MONDAY\" to enum: MONDAY"
        DayOfWeek stringtoEnum = DayOfWeek.valueOf("MONDAY");
        System.out.println("Converting string \"MONDAY\" to enum :"+stringtoEnum);


        // TODO: Print header "\nEnum comparison:"
        System.out.println("\nEnum comparison:");
        
        // TODO: Compare MONDAY == MONDAY using == operator and print result
        //       Format: "MONDAY == MONDAY: true"
        // Compare same constants (should be true)
        System.out.println("MONDAY == MONDAY: " + (DayOfWeek.MONDAY == DayOfWeek.MONDAY));


        // TODO: Compare MONDAY == FRIDAY using == operator and print result
        // Compare different constants (should be false)
        System.out.println("MONDAY == FRIDAY: " + (DayOfWeek.MONDAY == DayOfWeek.FRIDAY));
    }
}
