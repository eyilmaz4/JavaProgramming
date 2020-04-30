package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReverseArrayListCollections {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        reverse(newList);

        ArrayList<String> newS = new ArrayList<>(Arrays.asList("abc", "bcd", "cde", "d", "e", "f"));
        reverseStringArr(newS);
        reverseAll(newS);
    }

    public static void reverse(ArrayList<Integer> arr) {
        Collections.sort(arr, Comparator.reverseOrder());
        System.out.println(arr);
    }

    public static void reverseStringArr(ArrayList<String> arr) {
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);
    }

    public static void reverseAll(ArrayList<String> arr) {
       String x="";
        for (int i=0; i<arr.size(); i++) {
            StringBuilder reversed = new StringBuilder(arr.get(i));
            reversed.reverse();
            reversed.toString();
         x+=reversed;
          arr.set(i, x);
          x="";
        }
        System.out.println(arr);
    }
}
