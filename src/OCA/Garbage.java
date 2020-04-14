package OCA;

public class Garbage {
    public static void main(String[] args) {
        String one=new String("a");
        String two=new String ("b");
        one=two;
        System.gc();

    }
}
