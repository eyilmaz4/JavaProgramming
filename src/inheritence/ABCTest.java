package inheritence;

public class ABCTest {
    public static void main(String[] args) {
        A obj1=new A();
        System.out.println(obj1.getA());

        B obj2=new B(2);
        System.out.println(obj2.getA());

        C obj3=new C(5);
        System.out.println(obj3.getA());
        obj3.setA(40);
        obj2.setA(60);

        System.out.println(obj1.getA());
        System.out.println(obj2.getA());
        System.out.println(obj3.getA());
    }
}
