package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Combine2ArraysList {
    public static void main(String[] args) {
ArrayList<Integer>arr1=new ArrayList<>(Arrays.asList(1,2,3));
       ArrayList<Integer>arr2=new ArrayList<>(Arrays.asList(4,5,6));
       combine(arr1,arr2);
    }
    public static void combine(ArrayList<Integer>arr1, ArrayList<Integer>arr2){
        ArrayList<Integer>news=new ArrayList<>();
        for(int i=0; i<arr1.size(); i++){
            news.add(arr1.get(i));
        }
        for( int i=0; i<arr2.size(); i++){
            news.add(arr2.get(i));
        }
        System.out.println(news);
    }
}
