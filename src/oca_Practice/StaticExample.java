package oca_Practice;

import org.w3c.dom.ls.LSOutput;

public class StaticExample {
     static final int NUM_BUCKETS = 45;

    public static void main(String[] args) {
        //NUM_BUCKETS = 5; // DOES NOT COMPILE
    } }
class StaticInitializer{
    private static  int NUM_SECONDS_PER_HOUR=30;//if you write final you cant change
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }


    public static void main(String[] args) {
        System.out.println(NUM_SECONDS_PER_HOUR);
        NUM_SECONDS_PER_HOUR=45;
        System.out.println(NUM_SECONDS_PER_HOUR);
        System.out.println(deneme.one);
    }

}
class deneme {
    static int one;
    static final int two;
    private static final int three = 3;
    //private static final int four; // DOES NOT COMPILE

    static {
        one = 1;
        two = 2;
//        three = 3; // DOES NOT COMPILE
//        two = 4; // DOES NOT COMPILE
    }

    static {
        one = 2;
        //two=1;//since it is final
    }

    public static void main(String[] args) {


        int[][] arr = new int[2][3];
        {

        arr[0][0] = 1;
        arr[0][1] =2;

        int[] aa = new int[10];

    }
}}