import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Green mile", 1996);
        Author author = new Author("Stiven", "King");
        System.out.println("book.bookTitle = " + book.getBookTitle());
        System.out.println("book.year = " + book.getYear());
        System.out.println("author.name = " + author.getName());
        System.out.println("author.surname = " + author.getSurname());

    }
}