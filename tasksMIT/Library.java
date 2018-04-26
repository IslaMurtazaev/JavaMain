package tasksMIT;

import java.util.ArrayList;

public class Library {

    public String address;

//    private ArrayList<tasksMIT.Book> borrowedBooks = new ArrayList<>();

    private ArrayList<Book> currentBooks = new ArrayList<>();

    public void addBook(Book newBook){
        currentBooks.add(newBook);
    }

    public void printAddress(){
        System.out.println(address);
    }

    public static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAvailableBooks(){
        if (currentBooks.isEmpty()){
            System.out.println("No book in catalog.");
        }
//        for (tasksMIT.Book b : currentBooks){
//            if (currentBooks.get(currentBooks.size()-1) == b){
//                System.out.println(b.getTitle());
//            }
//            System.out.print(b.getTitle()+", ");
//        }
        for (Book b : currentBooks){
            if (!b.isBorrowed()){
                System.out.println(b.getTitle());
            }
        }
    }

    public void borrowBook(String bookTitle){
        for (Book b : currentBooks){
            if (b.getTitle().equalsIgnoreCase(bookTitle)){
                if (b.isBorrowed()){
                    System.out.println("Sorry, this book is already borrowed.");
                } else {
                    System.out.println("You successfully borrowed "+b.getTitle()+".");
                    b.rented();
                }
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");

//        if (b.isBorrowed()){
//            borrowedBooks.add(b);
//            currentBooks.remove(b);
//        } else {
//            System.out.println("Sorry, currently we don't have this book");
//        }
    }

    public void returnBook(String bookTitle){
        for (Book b : currentBooks){
            if (b.getTitle().equalsIgnoreCase(bookTitle) && b.isBorrowed()){
                b.returned();
                System.out.println("You successfully returned "+b.getTitle());
            }
        }
    }

    public Library(String address){
        this.address = address;
    }


    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 tasksAIU.Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("tasksMIT.Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("tasksMIT.Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 