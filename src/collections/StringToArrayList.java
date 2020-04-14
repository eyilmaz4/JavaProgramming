package collections;

import java.util.ArrayList;

public class StringToArrayList {
    public static void main(String[] args) {
        String a="Java is fun";
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0; i<a.length(); i++){
            arr.add(i,a.charAt(i));
        }
        System.out.println(arr);
    }
}
