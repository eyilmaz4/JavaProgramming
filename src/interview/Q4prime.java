package interview;

public class Q4prime {
               public static void main(String[] args) {
                printPrimeNumbers(100);
            }
public static void printPrimeNumbers(int limit){
                int count;
                for (int i = 1; i <= limit; i++) {
                    count = 0;
                    for (int j = i; j >=1 ; j--) {
                        if(i%j==0){
                            count++;
                        }
                    }
                    if(count==2){
                        System.out.println(i);
                    }
                }
            }
}

