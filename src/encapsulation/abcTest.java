package encapsulation;

import org.w3c.dom.ls.LSOutput;

public class abcTest {
    public static void main(String[] args) {
        abc myABC= new abc();
        abc.getA();
        abc.setA(12);
        System.out.println(abc.getA());
    }


}
