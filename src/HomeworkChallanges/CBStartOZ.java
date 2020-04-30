package HomeworkChallanges;

public class CBStartOZ {
    public static void main(String[] args) {
        System.out.println(startOz("ozdrmehmet"));
        System.out.println(startOz("osman"));
        System.out.println(startOz("ezhra"));
    }
    public static String startOz(String str) {
        String word="";

        if(str.length()>=2){
            if(str.charAt(0)=='o'&& str.charAt(1)=='z'){
                word+="oz";
            }
            else if(str.charAt(0)=='o'){
                word="o";
            }
            else if(str.charAt(1)=='z'){
                word="z";
            }
        }
return word;


    }
}
