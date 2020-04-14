package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftNumberFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>myList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        shift(myList,2);
    }
    public static void shift(ArrayList<Integer>arr, int number){
        ArrayList<Integer>newList=new ArrayList<>();
        for(int i=number; i<arr.size(); i++){
            newList.add(arr.get(i));
        }
        System.out.println(newList);
        newList.toArray();
    }

}
