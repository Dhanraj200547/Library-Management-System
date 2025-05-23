public class Book {
    int id;
    String title;
    String author;
    boolean isIssued;
    // constructor
    public Book(int id,String title,String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
    //Getters and setters or Encapsulation
    public int getid(){
        return id;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public boolean isIssued(){
        return isIssued;
    }
    public void issueBook(){
        if(!isIssued){
            isIssued = true;
            System.out.println("Book" + title +"issued successfully");
        }else{
            System.out.println("Book" + title + "is already issued");
        }
    }
    public void returnBook(){
        if(isIssued){
            isIssued = false;
            System.out.println("Book"+ title +"is returned succesfully");
        }else{
            System.out.println("Book" + title +"was not issued");
        }
    }
}
