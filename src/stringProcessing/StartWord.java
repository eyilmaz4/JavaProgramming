package stringProcessing;

public class StartWord {
    public static void main(String[] args) {
        System.out.println(startWord("hippo","xip"));
    }
    public static String startWord(String str,String word){
        String start = str.substring(1,word.length());
        String wordExceptFirst = word.substring(1,word.length());
        if(start.equals(wordExceptFirst)){
            return str.substring(0,word.length());
        }
        else {
            return "";
        }
    }

}
