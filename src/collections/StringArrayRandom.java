package collections;

import java.util.ArrayList;
import java.util.Random;

public class StringArrayRandom {
    public static void main(String[] args) {
       ranStrings();
       startUpper();
       startVowel();

    }
    public static void ranStrings(){
        String upper = "ABCDEFGHIJKLMNOPRSTUVYXZQ";//I added to make first letter capital
        String letter = "abcdefghijklmnoprstqvyz";
     ArrayList<String> words=new ArrayList<>();//empty string arraylist
       String word;
        for(int i=0; i<100; i++) {
            word="";
            word+=letter.charAt((int) (Math.random() * letter.length()));;
            for (int j = 0; j < 4; j++) {
                word += letter.charAt((int) (Math.random() * letter.length()));
            }
            words.add(word);

        }
        System.out.println(words);


    }
    public static void startUpper() {

        ArrayList<String> words = new ArrayList<>();//empty string arraylist
        String upper="ABCDEFGHIJKLMNOPRSTUVYXZQ";
        String letter="abcdefghijklmnoprstqvyz";
        String word;
        for (int i = 0; i < 100; i++) {
            word = "";
            word += upper.charAt((int) (Math.random() *upper.length()));
            ;
            for (int j = 0; j < 4; j++) {
                word += letter.charAt((int) (Math.random() * letter.length()));
            }
            words.add(word);

        }
        System.out.println(words);
    }
        public static void startVowel(){
        ArrayList<String> words=new ArrayList<>();//empty string arraylist
        String vowel="AEIUO";
            String letter="abcdefghijklmnoprstqvyz";
        String word;
        for(int i=0; i<100; i++) {
            word="";
            word+=vowel.charAt((int) (Math.random() * vowel.length()));;
            for (int j = 0; j < 4; j++) {
                word += letter.charAt((int) (Math.random() * letter.length()));
            }
            words.add(word);

        }
        System.out.println(words);

    }
        }

