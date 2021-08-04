public class Book implements Packable {
    private String author;
    private String name;
    private double weight;

    public Book(String bookAuthor, String bookName, double bookWeight) {
        this.author = bookAuthor;
        this.name = bookName;
        this.weight = bookWeight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.name;
    }
}
