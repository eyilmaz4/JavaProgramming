package recursion;

public class FirstRecursion {
    public static void main(String[] args) {
        callME(10);
    }

    public static void callME(int count) {
        System.out.println(count);
        if (count > 0) {
            callME(--count);
        }
    }
}