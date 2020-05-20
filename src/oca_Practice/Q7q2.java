package oca_Practice;

public class Q7q2 {
    public static void main(String[] args) {
new Bird("parrot");
    }
}
class Animal{
    Animal() {
        super();
    }
}
class Bird extends Animal{
 public Bird(String name) {
     System.out.println(name);

    }
    Bird(){
        System.out.println("unknown");
    }
}
