package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 3, 2, 1));
            ArrayList<Integer> newList = new ArrayList<Integer>();
            for (int number : arr) {
                if (!newList.contains(number)) {
                    newList.add(number);
                }
            }
            System.out.println(newList);


        }
    }
