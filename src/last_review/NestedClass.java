package last_review;

public class NestedClass {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
    }
}
class Outer{
    void outer(){
        System.out.println("this is outer");
    }
    class Inner{
        void inner(){
            System.out.println("inner");
        }
    }
}
