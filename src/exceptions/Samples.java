package exceptions;

public class Samples {
    public static void main(String[] args) {
        try{
            System.out.println(4/0);
            System.out.println("code");
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        int i=50;
        int j=0;
        int data;
        try {
            data=i/j;
            System.out.println(data);
        }
        catch(Exception e){
            System.out.println(i/(j+2));
        }
        try {
            int dataA=50/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
