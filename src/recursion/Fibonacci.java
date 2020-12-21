package recursion;

public class Fibonacci {
    public static void main(String[] args)
    {
        System.out.println(fibonacciS(10));
    }
    public static int fibonacciS(int n){
     if(n<=1){
         return n;
     }
        else {
            return fibonacciS(n-1)+fibonacciS(n-2);
        }
    }
}
