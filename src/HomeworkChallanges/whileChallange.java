package HomeworkChallanges;

public class whileChallange {
    public static void main(String[] args) {
       int n=123, r, sum=0;
        while(n>0){
            r=n%10;  //getting remainder 2
            sum=(sum*10)+r;//2
            n=n/10;//12
        }
        System.out.println(n);
        System.out.println(sum);

    }
}
