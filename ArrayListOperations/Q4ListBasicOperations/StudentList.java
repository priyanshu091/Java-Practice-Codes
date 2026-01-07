package ArrayListOperations.Q4ListBasicOperations;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    List <String> listStudent=new ArrayList<>();



    void addStudent(String stuName){
        listStudent.add(stuName);
    }

    void removeStudent(String stuName){

        int index=0;

        while(index < listStudent.size()){

            if (stuName.equals(listStudent.get(index))){
            listStudent.remove(index);
                System.out.println("Student Removed Successfully:"+stuName);
            continue;
            }
            index++;
        }
    }
    void searchStudentIndex(String stuName){
        int index=0;
        boolean found=false;
        while(index< listStudent.size()){

            if (stuName.equals(listStudent.get(index))){
                System.out.println("Student "+stuName+" found at index:"+index);
                found = true;
            }

            index++;

        }
        if (!found){
            System.out.println("Student not Found:"+stuName);
        }

    }
    void displayAll(){
int index = 0;
while(index<listStudent.size()){

    System.out.print(listStudent.get(index)+":");
    index++;
}
        System.out.println();
    }

}
