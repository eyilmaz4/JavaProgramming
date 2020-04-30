package mentoring;
//1. Sort the following arraylist from low to high:

import java.util.ArrayList;
import java.util.Arrays;

//ArrayList<Integer> a = {4, 15, 1, 89, 24};
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(4, 15, 1, 89, 24));
        ArrayList<Integer>list2=new ArrayList<>();
        int min=list.get(0);
        int index=0;
        int temp=0;
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size();j++){

            if(list.get(i)<list.get(j)){
                min=list.get(j);
                temp=list.get(i);
                list.set(i,min);
                list.set(j,temp);

            }
        }}
        System.out.println(list);
    }
}
