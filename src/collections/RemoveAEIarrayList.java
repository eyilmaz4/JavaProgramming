package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAEIarrayList {
    public static void main(String[] args) {
        ArrayList<String>myList=new ArrayList<>(Arrays.asList("abc", "skw", "kil", "mnf","cde","mer"));
        remove(myList);
        removeChar(myList,"s","m","i");
    }
    public static void remove(ArrayList<String>arr){
        ArrayList<String>newList=new ArrayList<>();
        for(String element:arr){
            if(!(element.contains("a")||element.contains("e")||element.contains("i"))){
                newList.add(element);
            }

        }
        System.out.println(newList);

    }

    public static void removeChar(ArrayList<String>arr, String a, String b, String c){
        ArrayList<String>newList=new ArrayList<>();
        for(String element:arr){
            if(!(element.contains(a)||element.contains(b)||element.contains(c))){
                newList.add(element);
            }

        }
        System.out.println(newList);

    }

}
