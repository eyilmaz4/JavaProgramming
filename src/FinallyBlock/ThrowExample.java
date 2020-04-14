package FinallyBlock;

public class ThrowExample {
    public static void main(String[] args) {;
        int age=30;
        if(age<21){
            throw new ArithmeticException("under 21"){

            };
        }
        else {
            System.out.println("its ok");
        }
    }
}
