import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Adding data
        library.addBook("Wings of Fire","Dr.A.P.J.Abdul Kalam");
        library.addBook("2011","shastri");
        library.addUser("Dhanraj");
        library.addUser("Max");

        while(true){
            System.out.println("\n Library Management System");
            System.out.println("1.Display Books");
            System.out.println("2.Add Book");
            System.out.println("3.Add User");
            System.out.println("4.Issue Book");
            System.out.println("5.Return Book");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1 : library.displaybooks();
                break;
                case 2 : {
                    sc.nextLine();
                    System.out.println("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter book author: ");
                    String author = sc.nextLine();
                    library.addBook(title,author);
                    break;
                }
                case 3 :{
                    sc.nextLine();
                    System.out.println("Enter user name: ");
                    String name = sc.nextLine();
                    library.addUser(name);
                    break;
                }
                case 4 :{
                    System.out.println("Enter the bookId: ");
                    int issueid = sc.nextInt();
                    library.issueBook(issueid);
                    break;
                }
                case 5 :{
                    System.out.println("Enter bookId to return: ");
                    int returnid = sc.nextInt();
                    library.returnBook(returnid);
                    break;
                }
                case 6 :{
                    System.out.println("Exiting!!");
                    sc.close();
                    return;
                }
                default :
                    System.out.println("Invalid choice.Try again!!");
            }
        }
    }
}
