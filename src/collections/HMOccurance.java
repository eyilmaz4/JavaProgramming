package collections;

import java.util.HashMap;
import java.util.Iterator;

public class HMOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }

        }
        int key = 0;
        Iterator<Integer> iter = hm.keySet().iterator();
        while (iter.hasNext()) {
            key = iter.next();
            System.out.println(key + hm.get(key));

        }
    }
    /*
        public static void main(String[] args) {
        int arr[] = {1,2,1,1,1,4,4,4,3,4,3,2,2,};
        System.out.println(findOccur(arr));
    }
    public static HashMap<Integer,Integer> findOccur(int[] arr){
        HashMap<Integer,Integer> result = new HashMap<>();
        for (int num : arr){
            if(result.containsKey(num)){
                result.put(num,result.get(num)+1);
            }
            else{
                result.put(num,1);
            }
        }
        return result;

     */
}