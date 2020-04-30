package collections;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashSet;

public class ArrayListRemoveDuplicateInt {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 4, 5, 5, 5, 88));
        removeDup(mylist);
    }

    public static void removeDup(ArrayList<Integer> arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int number:arr){
            hs.add(number);
        }
        System.out.println(hs);
    }
    /*
    package collection_review;
​
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
​
public class ArrayListDuplicateRemove {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,1,2,3,1,3,4,2));
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        System.out.println(arrayList);
​
    }

     */


}

