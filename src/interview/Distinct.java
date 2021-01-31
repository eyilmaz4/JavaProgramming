package interview;

import collections.list;

import java.util.ArrayList;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        String word="madam";
        String word2="my name is granar";
        String word3="my name is esra";


        System.out.println(distinctLetter(word,'m'));
        System.out.println(distinctLetter(word2,'a'));
        System.out.println(distinctLetter(word2,'a'));
    }
    public static int distinctLetter(String word, char letter){
        int count=0;
        List<Character>space=new ArrayList<>();
        for (int i=0; i<word.length(); i++){
             if(word.charAt(i)!=32) {
                 space.add(word.charAt(i));
             }

        }
        List<Integer>list=new ArrayList<>();

        for(int i=0; i<space.size(); i++){
            if(space.get(i)==letter){
                list.add(i);
            }
        }
        return list.get(1)-list.get(0);

    }
}
