package stringProcessing;

public class Third {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("OrhanDemirci");
        System.out.println(str);
        str.setCharAt(0,'E');
        System.out.println(str);
        System.out.println(str.codePointCount(0,6));
        System.out.println(str.codePointAt(3));//returning unicode 16 bit more represent value ASCII 8 bit 256
    }
}
