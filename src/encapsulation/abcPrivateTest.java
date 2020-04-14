package encapsulation;

public class abcPrivateTest {
    public static void main(String[] args) {
        abcPrivate myAbc=new abcPrivate();
        myAbc.getA();
        myAbc.setA(23);
        System.out.println(myAbc.getA());
    }
}
