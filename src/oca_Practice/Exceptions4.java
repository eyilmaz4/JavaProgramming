package oca_Practice;

public class Exceptions4 {
    static Integer i;

    public static void main(String[] args) {
        try {
            System.out.println(i.doubleValue());
        } catch (NullPointerException e) {
            System.out.println(e.getClass().getSimpleName());

        }
    }
}
