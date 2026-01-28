package MapInterface;/*
 * Assignment 1: Student Grade Manager
 * 
 * Objective: Practice basic Map operations (put, get, containsKey, size, isEmpty)
 * 
 * Instructions:
 * 1. Create a Map to store student names (String) as keys and their grades (Integer) as values
 * 2. Add at least 5 students with their grades
 * 3. Display the total number of students
 * 4. Check if a specific student exists and print their grade
 * 5. Check if the map is empty before and after adding students
 * 6. Try to get the grade of a student that doesn't exist
 * 
 * Sample Output:
 * Is map empty initially? true
 * Added 5 students
 * Total students: 5
 * Does John exist? true
 * John's grade: 85
 * Does Alice exist? false
 * Alice's grade: null
 */

import java.util.HashMap;
import java.util.Map;

public class Assignment1_StudentGradeManager {
    public static void main(String[] args) {
        // Your code here

        Map<String,Integer> studentMap=new HashMap<>();

        System.out.println("Is map empty initially? "+studentMap.isEmpty());

        System.out.println("\n ===Adding Students===");
        studentMap.put("Divyansh",91);
        studentMap.put("Aman",61);
        studentMap.put("Raj",75);
        studentMap.put("Saksham",93);
        studentMap.put("Anshuman",99);
        System.out.println();

        System.out.println("Added 5 students to the grade book\n");

        System.out.println("Total Students are :"+studentMap.size());

        System.out.println("=== Checking Individual Students ===");

String stu1="Saksham";
if (studentMap.containsKey(stu1)){
    System.out.println("Student " +stu1+" found");
    System.out.println("Student name: "+stu1+" ,Student Marks:"+studentMap.get(stu1));
}
else{
    System.out.println("Student does not Exist:"+stu1);
}
        System.out.println();

String stu2="Rahul";
if (studentMap.containsKey(stu2)){
    System.out.println("Student " +stu2+" found");
    System.out.println("Student name: "+stu2+" ,Student Marks:"+studentMap.get(stu2));
}
else{
    System.out.println("Student does not Exist:"+stu2);
}
        System.out.println();

        System.out.println("=== Grade Analysis ===");
        for (String s : studentMap.keySet()) {
            System.out.println("Student Name:"+s+", Grade:"+studentMap.get(s));

        }
    }
}
