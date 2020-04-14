package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CutHalf {
    public static void main(String[] args) {


        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6,7));

        System.out.println(cutInHalf(myList));
cutAndPrint(myList);
        ArrayList<Integer> newList = new ArrayList<>();
        int cut = myList.size() / 2;
        for (int i = 0; i < cut; i++){
            newList.add(myList.get(i));
        }
        System.out.println(newList);
    }
    //method return
    public static ArrayList<Integer> cutInHalf(ArrayList<Integer>listToCut){
        int halfIndex=listToCut.size()/2;
        ArrayList<Integer>half=new ArrayList<>();
        for(int i=0; i<halfIndex; i++){
            half.add(listToCut.get(i));
        }
        return half;
    }
    //method void
    public static void cutAndPrint(ArrayList<Integer>arr){
        ArrayList<Integer>half1=new ArrayList<>();
        ArrayList<Integer>half2=new ArrayList<>();
        for(int i=0; i<arr.size()/2;i++){
            half1.add(arr.get(i));
        }
        for(int i=arr.size()/2; i<arr.size();i++){
            half2.add(arr.get(i));
        }

        System.out.println(half1);
        System.out.println(half2);
    }
}