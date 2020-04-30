package collections;

import java.util.HashMap;
import java.util.HashSet;

public class EdaBit2ArraysUnique {
    public static void main(String[] args) {
int [] arr1={1,2,3,4,4,4};
int [] arr2={5,7,2};
        System.out.println(UniqueNumbers(arr1,arr2));

        System.out.println(hasEqualUnique(arr1, arr2));
        HashSet<Integer>mySet=new HashSet<>();
        for(int x:arr1){
            mySet.add(x);
        }
        System.out.println(mySet);


    }

    public static boolean UniqueNumbers(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map1 = new HashMap();
        HashMap<Integer, Integer> map2 = new HashMap();

        for (int i = 0; i < arr1.length; i++) {
            if (map1.containsKey(arr1[i])) {
                map1.put(arr1[i], map1.get(arr1[i]) + 1);
            } else {
                map1.put(arr1[i], 1);
            }
        }
        System.out.println(map1);

        for (int i = 0; i < arr2.length; i++) {
            if (map2.containsKey(arr2[i])) {
                map2.put(arr2[i], map2.get(arr2[i]) + 1);
            } else {
                map2.put(arr2[i], 1);
            }
        }
        System.out.println(map2);

boolean result=false;
        if (map1.size() == map2.size()) {
            result= true;
        }
return result;
    }

    public static boolean hasEqualUnique(int []arr1, int [] arr2){
        boolean result=false;
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        // adding elements of arr1
        for(int num:arr1){
            set1.add(num);
        }
        for(int num:arr2){
            set2.add(num);
        }
        if(set1.size()==set2.size()){
            result=true;
        }
        return result;
    }

}
