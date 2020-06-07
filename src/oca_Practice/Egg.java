package oca_Practice;

import org.w3c.dom.ls.LSOutput;

public class Egg {
    public Egg() {
        number = 5;
    }
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println("main"+egg.number);
    }
    private int number = 3;
    { number = 4; }
    {
        System.out.println("private"+number);
    }

}

