package collections;

import java.util.HashMap;

public class EBKaraca {
    public static void main(String[] args) {
karacaCode("apple");
    }

    public static void karacaCode(String word) {
        HashMap<Character, Character> my = new HashMap<>();
       String newWord="";
       for(int i=word.length()-1; i>=0; i--){
           newWord+=word.charAt(i);
       }
        System.out.println(newWord);

        for (int i =0; i<newWord.length(); i++) {
            my.put(newWord.charAt(i),newWord.charAt(i));
            if (newWord.charAt(i) == 'a') {
                my.put(newWord.charAt(i), '0');
            } else if (newWord.charAt(i) == 'e') {
                my.put(newWord.charAt(i), '1');
            } else if (newWord.charAt(i) == '0') {
                my.put(newWord.charAt(i), '2');
            } else if (newWord.charAt(i)== 'u') {
                my.put(newWord.charAt(i), '3');
            }

        }
        System.out.println(my);
       char letter=' ';
       String realResult="";
        for(int i=0; i<newWord.length(); i++){
            letter+=newWord.charAt(i);
            if(my.containsKey(letter)){
                realResult+=my.get(letter);
            }
            else{
                realResult+=newWord.charAt(i);
            }
        }
        System.out.println(my);
    }
    /*
    public class EdabitEncryption {
    public static void main(String[] args) {
        String words[] = {"apple","banana","karaca"};
        for (String word : words){
            System.out.println(applyKaraca(word));
        }
    }
    public static String applyKaraca(String word){
        //step 1 reverse the string
        StringBuilder result = new StringBuilder(word);
        result.toString();
        result.reverse();
        //step 2 replace vowels
        HashMap<Character,Character> hm = new HashMap<>();
        hm.put('a','0');
        hm.put('e','1');
        hm.put('o','2');
        hm.put('u','3');
        char letter;
        String realResult="";
        for(int i = 0 ; i < result.length() ; i++){
            letter=result.charAt(i);
            if(hm.containsKey(letter)){
                realResult+=hm.get(letter);
            }
            else{
                realResult+=result.charAt(i);
            }
​
        }
        //step 3 add "aca"
        realResult+="aca";
        return realResult;
    }
     */
}