package IQ_Study;

public class All_prime {
    public static void main(String[] args) {

    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
