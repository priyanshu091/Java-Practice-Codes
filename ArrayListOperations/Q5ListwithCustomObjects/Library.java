package ArrayListOperations.Q5ListwithCustomObjects;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> bookList = new ArrayList<>();

    void addBook(int bookId, String title,String author){
Book book=new Book(bookId,title,author);
        bookList.add(book);
    }

    void findBookById(int searchbookID){
        int index=0;

        boolean found=false;
        while(index<bookList.size()){



                Book b=bookList.get(index);
                if (searchbookID==b.getBookId()){
                    System.out.println("=".repeat(25)+"Book Found"+"=".repeat(25));
                    System.out.println("Book Details:\n"+b);
                    found=true;
                }
                index++;


            }
        if (!found){
            System.out.println("=".repeat(25)+"Book Not Found"+"=".repeat(25));
        }
        }
        void showAllBooks(){
            System.out.println("=".repeat(25)+" Showing All Books "+"=".repeat(25));
        if (bookList.isEmpty()){

            System.out.println("No books in Library");
            return;
        }
        int index=0;
        while(index<bookList.size()) {
            Book b = bookList.get(index);

            System.out.println((index+1)+". "+b);
            index++;
        }
        }
    }

