package ArrayListOperations.Q4ListBasicOperations;

public class TestStudentList {

    public static void main(String[] args) {

        StudentList list1= new StudentList();

        list1.addStudent("Aman");
        list1.addStudent("Rahul");
        list1.addStudent("Sakshi");
        list1.addStudent("Ajeet");

        list1.displayAll();
        list1.removeStudent("Rahul");
        list1.searchStudentIndex("Sakshi");
        list1.searchStudentIndex("Abhinav");

    }
}
