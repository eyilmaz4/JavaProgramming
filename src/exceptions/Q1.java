package exceptions;

public class Q1 {
    public static void main(String[] args) {

        try{
            int a=9/0;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println(" arithmetic");
        }
        System.out.println("code");
    }
}
