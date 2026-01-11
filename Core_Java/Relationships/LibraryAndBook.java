public class LibraryAndBook {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", "James");
        Library library = new Library("City Library", book);
        library.display();
    }
}

class Book {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private String name;
    private Book book;

    Library(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public void display() {
        System.out.println(name + " has book: " + book.getTitle() + " by " + book.getAuthor());
    }
}
