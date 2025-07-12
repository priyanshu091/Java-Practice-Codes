public class Courses {

    static int maxCapacity;

    String courseName;

    int noOfStu;

    String[] enrolledStudents = new String[maxCapacity];

    static {
        maxCapacity=100;
    }

     static void setMaxCapacity(int maxCapacity){

        Courses.maxCapacity=maxCapacity;

     }

     void enrollStudents(String studentName){

        enrolledStudents[noOfStu]=studentName;
        noOfStu++;
     }
    void unenrollStudents(String studentName){
        
    }
}
