package collections;

import java.util.Arrays;

public class AnagramSort {
    public static void main(String[] args) {
        String word1="abcd";
        String word2="dcab";
        char[]chars1=word1.toCharArray();
        char[]chars2=word2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        System.out.println(chars1);
        System.out.println(chars2);
boolean isAnagram=true;
for(int i=0; i<chars1.length; i++){
    if(chars1[i]!=chars2[i]){
        isAnagram=false;
        break;
    }
}
//with loop
if(isAnagram){
    System.out.println("Anagram");
}
else {
    System.out.println("not Anagram");
}
//with method
        if(Arrays.equals(chars1,chars2)){
            System.out.println("anagram");
        }
        else {
            System.out.println("not an anagram");
        }
    }
}
