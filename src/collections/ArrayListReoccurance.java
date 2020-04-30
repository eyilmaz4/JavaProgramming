package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayListReoccurance {
    public static void main(String[] args) {
ArrayList<String>arr=new ArrayList<>(Arrays.asList("Java", "fun", "Java", "HTML","is","fun"));
removeReoccurance(arr);
    }
    public static void removeReoccurance(ArrayList<String>arr){
        HashSet<String>set=new HashSet<>();
        for( String word:arr){
            set.add(word);
        }
        System.out.println(set);
    }
    /*

public class ArrayListSecondOccurance {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java","is","fun","Java","yes","Java","Java","Java"));
        int counter=0;
        int index=0;
        for(int i = 0 ; i < list.size() ; i++ ){
            for (int j = i+1 ; j < list.size() ; j++) {
               Sout ("Compare"+ list.get(i)+"with");
                if(list.get(i).equals(list.get(j))){
                    Sout(list.get(j));
                    counter++;
                    if(counter==2) {
                        index = j;
                    }
                }
            }
        }
        System.out.println(index);
        list.remove(index);
        System.out.println(list);
    }

     */
}
