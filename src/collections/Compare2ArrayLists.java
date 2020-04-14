package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Compare2ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> newArr=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer>newArr2=new ArrayList<>(Arrays.asList(1,2,8,9,7));
        System.out.println(Compare(newArr,newArr2));
    }
    public static boolean Compare(ArrayList<Integer> list1, ArrayList<Integer>list2){
        boolean result=true;
        for(int i=0; i<list1.size(); i++){
            if(!(list1.get(i).equals(list2.get(i)))){
               result= false;
            }
        }
        return result;
    }
}
