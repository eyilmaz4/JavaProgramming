package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class StringALtoStringArray {
    public static void main(String[] args) {
ArrayList<String>news=new ArrayList<>(Arrays.asList("java", "is", "fun"));
convert(news);
    }
    public static void convert(ArrayList<String> arr){
        String [] array=new String[arr.size()];
        for(int i=0; i<array.length; i++){
            array[i]=arr.get(i);
        }
        System.out.println(Arrays.toString(array));
    }
}
