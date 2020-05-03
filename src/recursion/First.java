package recursion;

public class First {
    public static void main(String[] args) {
     doIt();
    }
    public static void doIt(){
        System.out.println("hello  world");
        doIt();
    }
}
