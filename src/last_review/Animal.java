package last_review;

public class Animal {
    int numberOfLegs;
    String name;

    public Animal(int numberOfLegs, String name){
        this.name=name;
        this.numberOfLegs=numberOfLegs;

    }
    public void makeSound(){
        System.out.println("my Sound");
    }
}
