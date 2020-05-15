package last_review;

public class ComputerTest {
    public static void main(String[] args) {
    Laptop a= new Laptop() ;
    a.charge();
    Computer b=new Laptop();
    b.turnOn();

        System.out.println(a instanceof Computer);
        System.out.println(b instanceof Computer);
        System.out.println(a instanceof Laptop);
        System.out.println(b instanceof Laptop);
    }
}
class Laptop implements Computer{
   public void turnOn(){
       System.out.println("on");
    }
    public void turnOff(){
        System.out.println("off");
    }
    public void charge(){
        System.out.println("charge");
    }
}