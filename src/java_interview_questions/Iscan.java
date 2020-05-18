package java_interview_questions;

public class Iscan {
    public static void main(String[] args) {
        int n = 72; int m = 101;
        prime(n);
        prime(m);
    }
    public static void prime(int n){
        boolean result = true;
        for (int i = 2; i <n/2 +1 ; i++) {
            if (n % i == 0) {
                result = false;
            }
        }
        System.out.println(result ? n + " is a prime number" : n + " is not a prime number");
    }
}

