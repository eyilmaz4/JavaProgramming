package last_review;

public class UpcastingExample {
    public static void main(String[] args) {
        Dictionary1 myD=new Dictionary1();
        Book1 book=(Book1)myD;
        myD.lookUp();
        book.read();
    }
}
class Book1{
    void read(){
        System.out.println("Reading");
    }
}
class Dictionary1 extends Book1{
    void lookUp(){
        System.out.println("Looking up");
    }
    /*
    public class UpCastingExample {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(500,5000);
        Book book = (Book)dictionary;
        dictionary.lookUp();
        book.read();
        System.out.println(dictionary.words);
        System.out.println(book.pages);
    }
}
class Book {
    int pages;
​
    public Book(int pages) {
        this.pages = pages;
    }
​
    void read(){
        System.out.println("Reading");
    }
}
class Dictionary extends Book{
    int words;
​
    public Dictionary(int pages, int words) {
        super(pages);
        this.words = words;
    }
​
    void lookUp(){
        System.out.println("Looking up");
    }
     */
}