package oca_Practice;

public class WhizP2_42 {
    public void eat()throws Exception{
        System.out.println("Animal eats");
    }

}
class Dog extends WhizP2_42{
    public void eat(){
        System.out.println("Dog eats");
    }

    public static void main(String[] args)throws Exception {//throws solves problem
        WhizP2_42 a=new Dog();
        Dog d=new Dog();
        d.eat();
        a.eat();
        Number t=2.0;
    }
}
