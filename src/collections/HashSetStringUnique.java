package collections;

import java.util.HashSet;

public class HashSetStringUnique {
    public static void main(String[] args) {
        System.out.println(findUnique("abcdeee"));
        System.out.println(isAllCharUnique("abcdee",false));
    }
    public static boolean findUnique(String word){
        boolean result=false;
        HashSet<Character>mySet=new HashSet<>();
        for(int i=0; i<word.length(); i++){
            mySet.add(word.charAt(i));

        }
        if(mySet.size()==word.length()){
            result=true;
        }
        else
        {
            result=false;
        }
        return result;
    }
    //approach 2
    public static boolean isAllCharUnique(String word,boolean x){
        HashSet<Character> chars = new HashSet<>();
        boolean result = true;
        for (int i = 0; i < word.length() ; i++) {
            if(!chars.add(word.charAt(i))){
                result=false;
            }
        }
        return result;
    }

}
