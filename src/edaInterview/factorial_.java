package edaInterview;

public class factorial_ {
    public static void main(String[] args) {
        System.out.println(findFactoriel(5));
    }
    public static int findFactoriel(int num){
        int number=1;
        for(int i=1; i<=num; i++){
            number*=i;
        }
        return number;
    }
}
