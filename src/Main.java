

public class Main {
    public static void main(String[] args) {

        Author author = new Author("Stiven", "King");

        Author author1 = new Author("Michail", "Bulgakov");

        System.out.println(author);
        System.out.println(author1);

        Book book = new Book("Green mile", 1996, author);
        Book book1 = new Book("Master and Margarita", 1966, author1);

        System.out.println(book);
        System.out.println(book1);

        book1.setYear(1967);
        System.out.println(book1);
    }
}