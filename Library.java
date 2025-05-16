import java.util.ArrayList;

public class Library {
    static int bookCount = 0; // counter for books

    ArrayList<Book> Books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    // add a book to books list
    public void addBook(String title, String author){
        Book newBook = new Book(++bookCount ,title,author);
        Books.add(newBook);
        System.out.println("Book added: "+ title);
    }
    // add a user to users list
    public void addUser(String name){
        User newUser = new User(users.size() + 1, name);
        users.add(newUser);
        System.out.println("User added = "+ name);
    }
    //Display all books
    public void displaybooks(){
        System.out.println("\n Library books:");
        for (Book book : Books){
            System.out.println("ID: "+ book.getid() + " Title: "+ book.gettitle() + " Author: "+ book.getauthor() +" Issued: "+ (book.isIssued() ? "Yes" : "No") );
        }
    }
    // issue book
    public void issueBook(int bookId){
        for (Book book:Books){
            if(book.getid() == bookId) {
                book.issueBook();
                return;
            }
        }
        System.out.println("Book ID "+ bookId +"not found");
    }
    // return book
    public void returnBook(int bookId){
        for (Book book : Books){
            if(book.getid() == bookId){
                book.returnBook();
                return;
            }
        }
        System.out.println("Book ID" + bookId + "not found");
    }
}
