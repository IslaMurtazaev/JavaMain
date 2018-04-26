package tasksMIT;

public class Book {

    private String title;
    private boolean borrowed;

    public Book(String bookTitle) {
        title = bookTitle;
    }
   
    public void rented() {
        borrowed = true;
    }
   
    public void returned() {
        borrowed = false;
    }
   
    public boolean isBorrowed() {
        return borrowed;
    }
   
    public String getTitle() {
        return title;
    }

    public static void main(String[] arguments) {
        // Small test of the tasksMIT.Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
} 