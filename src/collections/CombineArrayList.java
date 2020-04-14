package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>newArr=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer>newArr2=new ArrayList<>(Arrays.asList(4,5,6,7,8));

              System.out.println(combine(newArr,newArr2));
//        arr1.addAll(arr2);//built-in method
//        System.out.println(arr1);

    }
    public static ArrayList<Integer> combine(ArrayList<Integer> List1, ArrayList<Integer>List2){
        ArrayList<Integer>combinedList=new ArrayList<>();
        for(int i=0; i<List1.size(); i++){ //for(int element:List1){combinedList.add(element)
            combinedList.add(List1.get(i));
        }
        for(int i=0; i<List2.size(); i++){
            combinedList.add(List2.get(i));
        }
        return combinedList;
    }
}
