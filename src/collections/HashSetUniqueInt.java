package collections;

import java.util.HashSet;

public class HashSetUniqueInt {
    public static void main(String[] args) {
        System.out.println(isUnique(123456));
    }
    public static boolean isUnique(int number){
        String nums="";
        String numbers=nums+number;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0; i<numbers.length(); i++){
            hs.add(numbers.charAt(i));
        }
        if(hs.size()==numbers.length()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
