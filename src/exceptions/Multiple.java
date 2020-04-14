package exceptions;

public class Multiple {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            arr[5] = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bound exception");
        } catch (Exception e) {
            System.out.println("parent exception");
        }
        System.out.println("rest of the code");
    }
}


