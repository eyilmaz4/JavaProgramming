package exceptions;

public class Multiple4 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        try {
            arr[5] = 30 / 0;
        } catch (Exception e) {
            System.out.println("comoon task completed");
//        } catch (ArithmeticException e) {
//            System.out.println("task1 completed");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("task 2 comp");
//        }
            System.out.println("codes...");
        }
    }}