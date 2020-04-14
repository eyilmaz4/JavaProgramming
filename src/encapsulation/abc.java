package encapsulation;

public class abc {
    private static int a;
    private static int b;
    private static int c;

    public static int getA() {
        return a;
    }

    public  static void setA(int a) {
        abc.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        abc.b = b;
    }

    public  static int getC() {
        return c;
    }

    public  void setC(int c) {
        abc.c = c;
    }
}
