package stringProcessing;

public class EndCheck {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder(" java rocks");
        StringBuilder str2=new StringBuilder(" java");
        checkEnd(str,"ks");
        checkEnd(str2,"ka");
    }
    public static void checkEnd(StringBuilder str, String word){
        int index=0;
        boolean result=false;
        for(int i=str.length()-word.length(); i<str.length(); i++){
            if(str.codePointAt(i)==word.charAt(index)){
                result=true;
                index++;
            }

        }
        System.out.println(result);
        /*
        Melih s solution

          public static boolean end (String s,String end){
        return  (s.substring(s.length()-2).equals(end)) ? true : false;
    }
    //Duran
    ​
public class EndsSame {
    public static void main(String[] args) {
        String str1 = "Java Rocks";
        String str2 = "cks";
        System.out.println(isEndsSame(str1,str2));
​
    }
    public static boolean isEndsSame(String str, String end){
​
        int startIndex = str.length()-end.length(); //to find starting index of ending String
        int endIndex = str.length(); // end index of the ending string
        if(str.substring(startIndex,endIndex).equals(end)){
            return true;
        }
        else {
            return false;
        }
​

         */
    }
}
