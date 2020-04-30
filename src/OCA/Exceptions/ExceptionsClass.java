package OCA.Exceptions;
import java.lang.ArithmeticException;

public class ExceptionsClass {

    public static void main(String[] args) {
 int num1=2;
 int num2=0;
 divide(num1,num2);
 try {
     System.out.println(num1 / num2);
 }
 catch (ArithmeticException e) {
     System.out.println("division successful"
     );
 }

//        String numStr="123eghny43";//"123";
//        int numInt=Integer.parseInt(numStr);
//        System.out.println(numInt);


    }
    public static void divide(int num1, int num2){
       try{
           System.out.println(num1/num2);
           System.out.println("dividion successful");
       }
       catch(RuntimeException e) {
           System.out.println("failed");
           System.out.println(e.getMessage());
           e.getStackTrace();
           throw new RuntimeException(("you are trying to divide by zero are you stupid?"));
       }
       }
    }


