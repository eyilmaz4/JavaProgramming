package IQ_Study;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(71));
        System.out.println(isPrime(80));
        System.out.println(isPrime(121));
        System.out.println(isPrime(3));
        for(int i=-12; i<23; i++){
            System.out.println("number"+i+" "+isPrime(i));
        }
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;

            }
        }
        return true;
    }
}