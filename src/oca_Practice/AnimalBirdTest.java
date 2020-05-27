package oca_Practice;

public class AnimalBirdTest {
    static Animal1 a=new Bird1();

    public static void main(String[] args) {
         Animal1 a=new Bird1();
        System.out.println(a instanceof Fly);
        System.out.println(a instanceof Animal1);
        System.out.println(a instanceof Bird1);
    }
}
