package IQ_Study;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("java"));
        System.out.println(reverseSB("javac"));
    }
    public static String reverse(String word){
        String newWord="";
        for( int i=word.length()-1; i>=0; i--){
            newWord+=word.charAt(i);

        }
        return newWord;
    }
    public static String reverseSB(String text){
        String str=new StringBuilder(text).reverse().toString();
        return  str;

    }

}
