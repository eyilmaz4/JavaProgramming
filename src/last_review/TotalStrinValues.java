package last_review;

public class TotalStrinValues {
    public static void main(String[] args) {
        System.out.println(value("abc"));
    }
    public static int value(String word){
        int sum=0;
        for(int i=0; i<word.length(); i++){
           sum+=word.charAt(i);
            System.out.println(sum);
        }
        return sum;
    }
}
