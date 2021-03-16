package IQ_Study.edaStudy;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseStr("Birsen"));
        System.out.println(reverse2("Birsen"));
        System.out.println(reverseNum(820033));
        System.out.println(reverseNumRegular(1234));
    }
    public static String reverseStr(String str){
        String reverse="";
        for (int i = str.length()-1; i>=0 ; i--) {
            reverse+=str.charAt(i);

        }
        return reverse;
    }
    public static String reverse2(String str){
        StringBuilder sb=new StringBuilder(str);
       return  sb.reverse().toString();

    }
    public static int reverseNum(int num){
        String str=""+num;
        StringBuilder sb=new StringBuilder(str);
       int number= Integer.parseInt(sb.reverse().toString());
       return number;

    }
    public static int reverseNumRegular(int num){//1234
        String newNum=""+num;
        String reverse="";
        for (int i = newNum.length()-1; i>=0 ; i--) {
            reverse+=newNum.charAt(i);

        }
        int number= Integer.parseInt(reverse);
        return number;
    }

}
