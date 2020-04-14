package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConverArrayListToArray {

    public static void main(String[] args) {
        ArrayList<String> myList=new ArrayList<>(Arrays.asList("java", "is", "fun"));
        System.out.println(Arrays.toString(convertToArray(myList)));
    }
    public static String[] convertToArray(ArrayList<String> Arr){
       String [] array=new String[Arr.size()];
        for(int i=0; i<Arr.size(); i++){
            array[i]=Arr.get(i);
        }
        return array;
    }
}
