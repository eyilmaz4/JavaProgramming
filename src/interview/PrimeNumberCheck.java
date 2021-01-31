package interview;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(checkPrime(4));
    }
    public static boolean checkPrime(int number){
        if(number<=1){
            return false;
        }
        for (int i=2; i<Math.sqrt(number); i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
