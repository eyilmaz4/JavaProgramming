package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListLongestString {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>(Arrays.asList("Java","is","fun","always","need", "practice","why","Other", "Languages?"));
        LinkedList<Integer>nums=new LinkedList<>();
        for(int i=0; i<list.size(); i++){
            nums.add(list.get(i).length());
        }
        System.out.println(nums);
        int max=0;
        String word="";
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)>max){
                max=nums.get(i);
                word=list.get(i);
            }
        }
        System.out.println(word+"\t"+max+"\t");

        for (String word2 : list){
            nums.add(word2.length());
        }
        System.out.println(list);
        System.out.println(nums);
        int index = nums.indexOf(Collections.min(nums));
        System.out.println("The smallest word is :"+"\""+list.get(index)+"\""+" with the length of "+nums.get(index));
    }
}
