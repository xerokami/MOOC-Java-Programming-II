import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private BookList bookList;

    public UserInterface(Scanner scan, BookList bookList) {
        this.scan = scan;
        this.bookList = bookList;
    }

    public void start() {
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scan.nextLine();

            if (bookName.equals("")) {
                System.out.println(bookList.totalBooks());
                bookList.printBooks();
                break;
            }

            System.out.print("Input the age recommendation: ");
            int bookAge = Integer.valueOf(scan.nextLine());

            bookList.addBookToList(new Book(bookName, bookAge));
        }
    }
}
