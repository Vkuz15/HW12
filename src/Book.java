public class Book {
   private String bookTitle;
   private int year;

   public Book(String bookTitle, int year) {
      this.bookTitle = bookTitle;
      this.year = year;
   }

   public String getBookTitle() {
      return this.bookTitle;
   }

   public int getYear() {
      return this.year;
   }

}
