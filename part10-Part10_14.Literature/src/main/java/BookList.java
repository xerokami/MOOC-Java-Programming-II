import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookList {
    List<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    public void addBookToList(Book bookToAdd) {
        if (!bookList.contains(bookToAdd)) {
            bookList.add(bookToAdd);
        }
    }

    public String totalBooks() {
        return bookList.size() + " books in total.";
    }

    public void printBooks() {
        System.out.println("Books:");
        bookComparison();
        bookList.forEach(book -> System.out.println(book));
    }

    public void bookComparison() {
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(bookList, comparator);
    }
}
