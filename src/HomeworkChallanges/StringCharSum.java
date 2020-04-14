package HomeworkChallanges;

public class StringCharSum {
    public static void main(String[] args) {
        System.out.println(findCharValue("I love you"));
    }
    public static int findCharValue(String word){

        int result=0;
        for(int i=0; i<word.length(); i++){
     result+=(int)word.charAt(i);
        }
        return result;
    }
}
