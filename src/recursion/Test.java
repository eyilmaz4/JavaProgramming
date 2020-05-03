package recursion;

public class Test {
    static int count=1;

    public static void main(String[] args) {
testIt();
    }
    public static void testIt(){
        System.out.println("Recursion: "+count);
        count++;
        testIt();
    }
}
