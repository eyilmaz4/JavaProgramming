package last_review;

public class StaticEx {
    static int a=10;

    public static void main(String[] args) {
        Stt.method();
        method1();
        method2();

    }
    static void method1(){
        System.out.println("1");
    }
    static void method2(){
        System.out.println("2");
    }
}
class Stt{
    static void method(){
        System.out.println(StaticEx.a);
    }
}
