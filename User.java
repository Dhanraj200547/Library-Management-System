public class User {
    int userId;
    String Name;

    public User(int userId,String Name){
        this.userId = userId;
        this.Name = Name;
    }
    //getters
    public int getUserid(){
        return userId;
    }
    public String getName(){
        return Name;
    }
}
