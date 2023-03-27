package activities;

public class Activity5 {
    public static void main(String[] args){
        String title = "Cricket is life";
        Book newnovel = new myBook();
        newnovel.setTitle(title);
        System.out.println("The title is: "+ newnovel.getTitle());
    }
}
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class myBook extends Book{
    public void setTitle(String s){
        title=s;
    }
}