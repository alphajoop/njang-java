public class Class {

  public static void main(String[] args) {
    Book myBook = new Book(
      "To Kill a Mockingbird",
      "Harper Lee",
      281,
      "HarperCollins Publishers"
    );

    myBook.displayDetails();

    // Modifier les attributs de l'objet myBook
    myBook.title = "1984";
    myBook.author = "George Orwell";
    myBook.numberOfPages = 328;
    myBook.publisher = "Penguin Books";

    myBook.displayDetails();
  }
}

class Book {

  String title;
  String author;
  int numberOfPages;
  String publisher;

  Book(String title, String author, int numberOfPages, String publisher) {
    this.title = title;
    this.author = author;
    this.numberOfPages = numberOfPages;
    this.publisher = publisher;
  }

  public void displayDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Number of Pages: " + numberOfPages);
    System.out.println("Publisher: " + publisher);
  }
}
