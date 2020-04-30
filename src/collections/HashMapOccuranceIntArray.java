package collections;

import java.util.HashMap;

public class HashMapOccuranceIntArray {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,3,2,2};
        findFrequency(arr);
    }

    public static void findFrequency(int [] arr){
        HashMap<Integer, Integer>myMap=new HashMap<>();
        for(int num:arr){
            if(!myMap.containsKey(num)){
                myMap.put(num,1);
                System.out.println(myMap);
            }
            else
            {
                myMap.put(num,myMap.get(num)+1);
                System.out.println(myMap);
            }
        }
        for(int key:myMap.keySet()){
            System.out.println("number "+key+" = "+myMap.get(key)+" times seen in the array");
        }
    }



}
