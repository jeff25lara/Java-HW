package Class17HW;

public class BookTester {
    public static void main(String[] args) {
        Book book=new Book("The Alchemist",1988, "Paulo Coelho");
        book.printInfo();

        Book book1=new Book();
        book1.printInfo();
    }
}
