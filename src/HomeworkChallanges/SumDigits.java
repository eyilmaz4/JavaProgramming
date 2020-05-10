package HomeworkChallanges;

public class SumDigits {
    public static void main(String[] args) {
    }
    public int sumDigits(int n) {
            if(n<10){
                return n;
            }
            else if(n>=10 && n<100){
                return n%10+sumDigits(n/10);
            }
            else if(n>=100 && n<1000) {
                return n/100+sumDigits(n%100);
            }
            else if(n>=1000 && n<10000){
                return n/1000+sumDigits(n%1000);
            }
            else {
                return n/10000+sumDigits(n%10000);
            }


        }

    }

