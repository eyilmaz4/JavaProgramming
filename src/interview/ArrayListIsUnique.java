package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayListIsUnique {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //list.add(1);
        System.out.println(isUnique(list));
    }
    public static boolean isUnique(ArrayList<Integer>list){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0; i<list.size(); i++){
            set.add(list.get(i));
        }
        if(list.size()==set.size()){
            return true;
        }
        return false;
    }
}
