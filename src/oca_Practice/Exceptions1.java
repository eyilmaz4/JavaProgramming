package oca_Practice;

public class Exceptions1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);


        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array");
        } catch (Exception e) {
            System.out.println("parent rest");
        }
        try {
            int data = 50 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}