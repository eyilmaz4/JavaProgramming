package collections;

import java.util.HashMap;

public class HMsentenceRepeatingWords {
    public static void main(String[] args) {
        System.out.println("abc".toUpperCase());
        String a = "abc";
        a = a.toUpperCase();
        System.out.println(a);
        findRepeatingWords("the best way to learn java is to practice java using java and java");
    }

    public static void findRepeatingWords(String sentence) {
        sentence = sentence.toUpperCase();//convert all chars to upper
        String[] words = sentence.split(" ");//convert to string array(1 word in each element)
        //find the frequencies of the word
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
            for (String key : wordCounts.keySet()) {
                if (wordCounts.get(key) > 1) {

                }
            }
/* hocanin cozumu
            public class FindingRepeatingWords {
                public static void main(String[] args) {
                    String sentence="the best way to learn java is practice way java using java and java";
                    findRepeatings(sentence);
                }
                public static void findRepeatings (String sentence){
                    sentence=sentence.toUpperCase(); //convert all chars to Upper.
                    String[] words = sentence.split(" ");//convert to String array (1 word in each element)
                    //find the frequencies of the words
                    HashMap<String,Integer> wordCounts = new HashMap<>();
                    for(String word : words){
                        if(wordCounts.containsKey(word)){
                            wordCounts.put(word,wordCounts.get(word)+1);
                        }
                        else{
                            wordCounts.put(word,1);
                        }
                    }
                    System.out.println("REPEATING WORDS :");
                    for(String key : wordCounts.keySet()){
                        if(wordCounts.get(key)>1){
                            System.out.println(" --- "+key+" = \t"+wordCounts.get(key));
                        }
                    }
                }
*/
            }
    }
}