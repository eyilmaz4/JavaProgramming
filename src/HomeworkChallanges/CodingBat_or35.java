package HomeworkChallanges;

public class CodingBat_or35 {
    public static void main(String[] args) {
        System.out.println(or35(10));
    }
    public static boolean or35(int n) {
        boolean result=false;
        if (n %3==0 || n%5==0){
            result=true;
        }
        return result;
    }

}
