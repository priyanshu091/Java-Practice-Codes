public class Course {

    static int maxCapacity=100;
    String courseName;
    int enrolledStudents;

    Course(String courseName){
        this.courseName=courseName;
        this.enrolledStudents=0;
    }

    String[] Students = new String[maxCapacity];

    static void setMaxCapacity(int maxCapacity){
    Course.maxCapacity =maxCapacity;
    }
     void enrollStudent(String studentName){
        enrolledStudents=enrolledStudents+1;

        Students[enrolledStudents]=studentName;
        enrolledStudents++;

        System.out.println(studentName+" is Successfully Enrolled ");

    }
     void unenrollStudent(String studentName){

        enrolledStudents=enrolledStudents-1;
        System.out.println(studentName+" is Successfully Unenrolled ");

    }

}
