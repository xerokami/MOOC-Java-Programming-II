import java.util.Objects;

public class Book {
    private String name;
    private int age;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.age = ageRecommendation;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return this.name + " recommended for " + this.age + " year-olds or older";
    }
}
