

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Green mile", 1996);
        Author author = new Author("Stiven", "King");
        System.out.println("book.bookTitle = " + book.getBookTitle());
        System.out.println("book.year = " + book.getYear());
        book.setYear(1997);
        System.out.println("book.getYear() = " + book.getYear());
        System.out.println("author.name = " + author.getName());
        System.out.println("author.surname = " + author.getSurname());

        System.out.println(" ");

        Book book1 = new Book("Master and Margarita", 1966);
        Author author1 = new Author("Michail", "Bulgakov");
        System.out.println("book.bookTitle = " + book1.getBookTitle());
        System.out.println("book.year = " + book1.getYear());
        System.out.println("author.name = " + author1.getName());
        System.out.println("author.surname = " + author1.getSurname());

    }
}