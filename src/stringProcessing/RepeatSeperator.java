package stringProcessing;

public class RepeatSeperator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("word","x", 3));
    }
    public static String repeatSeparator(String word, String sep, int count){
       String result=word;
        for(int i=0; i<count-1; i++){
            result+=sep+word;
        }
        return result;
    }
}
