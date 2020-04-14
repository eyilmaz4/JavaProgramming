package HomeworkChallanges;

import java.util.Arrays;

public class removeString {
    //Remove specific characters in the String . Sample :  removeSome("Java is fun ","is")  output : Java fun
    public static void main(String[] args) {
        removeString("Java is fun", "is");
        removeString("java is fun","fun");
        removeString("I love Java","love");
    }


    public static void removeString(String sentence, String word) {

       char []newWord=new char [sentence.length()];
       for(int i=0; i<sentence.length(); i++){
           newWord[i]=sentence.charAt(i);
       }
       char [] newChar=new char [word.length()];
       for(int i=0; i<word.length(); i++){
           newChar[i]=word.charAt(i);
       }

       for (int i = 0; i < sentence.length()-1; i++) {
            for (int j = 0; j < word.length()-1; j++) {
                if (word.length() == 2) {
                    if (newWord[i] == newChar[j] && newWord[i + 1] == newChar[j + 1]) {
                        newWord[i] = ' ';
                        newWord[i + 1] = ' ';

                    }
                }

                if(word.length()==3){
                    if (newWord[i]==newChar[j] && newWord[i+1]==newChar[j+1]&&newWord[i+2]==newChar[j+2]){
                        newWord[i]=' ';
                        newWord[i+1]=' ';
                        newWord[i+2]=' ';
                    }
                }
                if(word.length()==4){
                    if (newWord[i]==newChar[j] && newWord[i+1]==newChar[j+1]&&newWord[i+2]==newChar[j+2]&&newWord[i+3]==newChar[j+3]){
                        newWord[i]=' ';
                        newWord[i+1]=' ';
                        newWord[i+2]=' ';
                        newWord[i+3]=' ';
                    }
                }
        }}
        for(char letters:newWord){
            System.out.print(letters);
        }
        System.out.println();

    }}