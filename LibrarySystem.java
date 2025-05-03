class Book {
    private String title;
    private String isbn;
    private boolean isAvailable;
    // Setters with validation
    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Error: Title cannot be empty!");
        }
    }
    public void setIsbn(String isbn) {
        if (isbn.length() >= 10) {
            this.isbn = isbn;
        } else {
            System.out.println("Error: ISBN must be 10+ characters!");
        }
    }
    public void setIsAvailable(boolean status) {
        isAvailable = status;
    }
    // Getters
    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
    public boolean getAvailability() { return isAvailable; }
    // Display book info
    public void displayBookInfo() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status: " + (isAvailable ? "Available" : "Issued"));
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Java Programming");
        book.setIsbn("1234567890");
        book.setIsAvailable(true);
        book.displayBookInfo();
    }
}