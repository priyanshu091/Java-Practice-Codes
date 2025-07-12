public class Book {

   static int totalbooks;
    String title;

    String author;

    String isbn;

    boolean isBorrowed;   //ye humne is liye bnaya hai QKi yhi btayega ki jo book admi borrow krna chah rha hai Kahi wo already borrowed to nhi hai
// simple bhasa me bole to hume ye info bhi kahi na kahi store krni hi pdegi kahi book already borrow to nhi hai jiske liye ye instance variable bnaya hai

    static {
       totalbooks=0;
    }

    {
        totalbooks++;
    }
Book(String isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
}
Book(String isbn){ //isi ko chaining bolte hai👇🏻 ... humne this lgakr uppr ke constructor ko link kr diya doosre constructor se
        this(isbn,"Unknown","Unknown");
}


    public int getTotalBooks(){
        return totalbooks;
    }
    public void borrowBook(){
        if (isBorrowed){
            System.out.println(title+" book is already borrowed");
        }
        else {
            this.isBorrowed=true;
            System.out.println("Successfully Borrrowed "+title);
        }
    }
    public void returnBook(){
        if (isBorrowed){
            System.out.println("Thanks for returning book "+title);

            isBorrowed=false;
        }
        else {
            System.out.println("This book "+title+" is already in the Library");
        }


    }

    public static void main(String[] args) {

        Book theSecret= new Book("091TS","The Secret","John");
        Book fireOfWings= new Book("02FOW");
        theSecret.borrowBook();
        fireOfWings.borrowBook();
        theSecret.borrowBook();
        fireOfWings.returnBook();
        fireOfWings.borrowBook();

    }

}
