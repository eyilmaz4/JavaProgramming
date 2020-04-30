package HomeworkChallanges;

public class CBin1to10 {
    public static void main(String[] args) {
        System.out.println(in1To10(1,false));
    }
    public static boolean in1To10(int n, boolean outsideMode) {

        boolean result;
        if(outsideMode){
            if(n<=1 || n>=10){
                result=true;
            }
            else {
                result=false;
            }
        }
        else {
            if(n>=1 || n<=10){
                result=true;
            }
            else{
                result=false;
            }
        }
        return result;
    }

}
