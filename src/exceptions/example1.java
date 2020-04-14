package exceptions;

import org.w3c.dom.ls.LSOutput;

public class example1 {
    public static void main(String[] args) {


        int x = 10;
        int y = 0;


        try {
            System.out.println(x / y);

        } catch (Exception e) {

        }
        System.out.println("can you see me?");

        String a = "a";
        try {
            int number = Integer.parseInt(a);
        } catch (Exception e) {
            System.out.println("sorry");

        }
    }
}