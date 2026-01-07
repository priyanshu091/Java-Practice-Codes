package ArrayListOperations.Q5ListwithCustomObjects;

public class TestLibrary {
    public static void main(String[] args) {

        Library lb = new Library();

        lb.addBook(001,"Coding Book","Anonymous");
        lb.addBook(002,"Theory Book","Unknown");

        lb.showAllBooks();
        lb.findBookById(003);
        lb.findBookById(001);

    }
}
