package IQ_Study;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
    public static int findFactorial(int num){
      int fact=1;
       if (num>0){
           for(int i=num; i>0;i-- ){
               fact*=i;

            }

        }
       return fact;
    }
}
