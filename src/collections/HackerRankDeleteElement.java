package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class HackerRankDeleteElement {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(12,0,1,78,12));
        list.add(5,23);
        list.remove(0);
        //System.out.println(list);
        Iterator<Integer> iter = list.iterator();
                while (iter.hasNext()) {
            System.out.print(iter.next()+"\t");
            /*public class ListHackerRank {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12,0,1,78,12));
        doIt(arr,5,23);
        System.out.println(arr);
        doIt(arr,0);
​
    }
    public static void doIt(ArrayList<Integer> arr, int index){
        arr.remove(index);
        System.out.println(arr);
    }
    public static void doIt(ArrayList<Integer> arr,int index,int element){
​
        arr.add(index,element);
    }
*/

    }
}
    }
