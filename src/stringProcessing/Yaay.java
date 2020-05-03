package stringProcessing;

public class Yaay {
    public static void main(String[] args) {
        System.out.println(turn("i","yay"));
    }
    public static String turn(String tag, String word){
        return "<"+tag+">"+word+"</"+tag+">";
    }
}
