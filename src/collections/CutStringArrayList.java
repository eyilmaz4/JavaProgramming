package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CutStringArrayList {
    public static void main(String[] args) {
        ArrayList<String>myList=new ArrayList<>(Arrays.asList("Java", "is" ,"fun"));

       cutHalf(myList);

        ArrayList<Integer>newArr=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer>newArr2=new ArrayList<>(Arrays.asList(4,5,6,7,8));

        System.out.println(cutHalfReturn(myList));

        System.out.println(combine(newArr,newArr2));
    }
    public static void  cutHalf(ArrayList<String> Arr){
        ArrayList<String>newArr=new ArrayList<>();
        ArrayList<String>newArr2=new ArrayList<>();
        for(int i=0; i<Arr.size()/2; i++){
            newArr.add(Arr.get(i));
        }
        for(int i=Arr.size()/2;i<Arr.size(); i++){
            newArr2.add(Arr.get(i));
        }
        System.out.println(newArr);
        System.out.println(newArr2);
    }
    public static ArrayList<String>  cutHalfReturn(ArrayList<String> Arr){
        ArrayList<String>newArr=new ArrayList<>();
        ArrayList<String>newArr2=new ArrayList<>();
        for(int i=0; i<Arr.size()/2; i++){
            newArr.add(Arr.get(i));
        }
        for(int i=Arr.size()/2;i<Arr.size(); i++){
            newArr2.add(Arr.get(i));
        }
        return newArr;
    }
    public static ArrayList<Integer> combine(ArrayList<Integer> List1,ArrayList<Integer>List2){
        ArrayList<Integer>combinedList=new ArrayList<>();
        for(int i=0; i<List1.size(); i++){
            combinedList.add(List1.get(i));
                    }
        for(int i=0; i<List2.size(); i++){
            combinedList.add(List2.get(i));
        }
        return combinedList;
    }
}
