package FinallyBlock;

public class Example1 {
    public static void main(String[] args) {
        try{
            System.out.println(6/2);
        }
        catch(ArithmeticException e){
            System.out.println("00000 zeroooo");
        }
        catch (Exception e){

            System.out.println("djhfj");
        }
        finally {
            System.out.println("hello");
        }
    }
}
