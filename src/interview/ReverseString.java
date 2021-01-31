package interview;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Esra"));
        System.out.println(reverseBuilder("Ibrahim"));
        System.out.println(reverse("Elif"));
    }
    public static String reverse(String word){
        String newWord="";
        for(int i=word.length()-1;i>=0; i--){
            newWord+=word.charAt(i);

        }
        return newWord;
    }
    public static StringBuilder reverseBuilder(String word){
        StringBuilder newWord=new StringBuilder(word);
        return newWord.reverse();
    }
}
