package exceptions;

public class Multiple3 {
    public static void main(String[] args) {
        String s=null;
        try {
            System.out.println(s.length());

        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic");

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
        catch (NullPointerException e){
    System.out.println("null");
}
        catch (Exception e){
            System.out.println("parent");
        }
        System.out.println("code...");
    }
}
