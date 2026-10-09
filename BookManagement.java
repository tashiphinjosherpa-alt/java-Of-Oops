class Book {
    // Data members
    String title;
    int page;
    

    // Method to display book details
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + page);
        
    }
}

public class BookManagement {
    public static void main(String[] args) {

        // Creating objects of Book class
        Book book1 = new Book();
        

        // Assigning values to book1
        book1.title = "MUna Madan";
        
        book1.page= 600;

        
        // Display book details
        System.out.println("Book 1 Details:");
        book1.display();

        System.out.println();

    }
}

