package Class17HW;

public class Book {
     /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    String name;
    int year;
    String author;

    public Book(String bookName, int bookYear, String bookAuthor){ // instance variables initialization
        name=bookName;
        year=bookYear;
        author=bookAuthor;
    }


    Book (){ // instance variables initialization
        name="This is how you lose her";
        author="Junot Diaz";
    }

    void printInfo(){
        System.out.println("Book Name: "+name+" Book Year: "+year+" Book Author: "+author);
    }
}
