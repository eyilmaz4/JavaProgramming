package FinallyBlock;

public class ThrowsExample {
    public static void main(String[] args) {
checkAge(30);
checkAge(10);
    }
    public static void checkAge(int age)throws ArithmeticException{
        if(age<21) {
            throw new ArithmeticException(("under 21")) {

            };
        }
            else{
                System.out.println("ok");
            }
        }
    }

