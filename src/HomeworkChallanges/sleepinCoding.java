package HomeworkChallanges;

public class sleepinCoding {
    public static void main(String[] args) {
        System.out.println(sleepIn(true,true));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleepIn=true;
        if(!weekday || vacation){
            sleepIn=true;
        }
        else if(weekday||!vacation){
            sleepIn=false;
        }
        else if(!weekday || !vacation){
            sleepIn=true;
        }
        return sleepIn;
    }


}
