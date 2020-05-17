package last_review;

import java.util.ArrayList;
import java.util.HashSet;

public class EdaBidChallnge {
    public static void main(String[] args) {

    }

    public static boolean isVowel(char ch) {
      ch=Character.toLowerCase(ch);
      if(ch=='a'||ch=='e'||ch=='u'||ch=='o'||ch=='i'){
return true;
    }
      else{
          return false;
      }
}
public static String removeDuplicates(String word){

        HashSet<Character>hs=new HashSet<>();
        for(int i=0; i<word.length(); i++){
            hs.add(word.charAt(i));
        }
        String result="";
        for(char ch:hs){
            result+=ch;

        }
        return result;

    }
    public static String removeSpaces(String word){
        String result="";
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)!=' '){
                result+=word.charAt(i);
            }
        }
        return result;
    }
 /*
 public class StrMethods {
​
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        if( ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i' ){
            return true;
        }
        else{
            return false;
        }
    }
​
    public static String removeDuplicates(String word){
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            hs.add(word.charAt(i));
        }
        String result = "";
        for (char ch : hs){
            result += ch;
        }
        return result;
    }
    public static String removeSpaces(String word){
        String result="";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)!=' '){
                result += word.charAt(i);
            }
        }
        return result;
    }
    public static String removeVowels(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if(!isVowel(word.charAt(i))){
                result += word.charAt(i);
            }
        }
        return  result;
    }

  */
}