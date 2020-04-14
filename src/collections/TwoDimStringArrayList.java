package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimStringArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>>myList=new ArrayList<>();
        ArrayList<String>myStr=new ArrayList<>(Arrays.asList("Java","is","Fun"));
        ArrayList<String>myStr2=new ArrayList<>(Arrays.asList("Java","is","Super"));
myList.add(myStr);
myList.add(myStr2);
        System.out.println(myList);
        upper(myList);
    }
    public static void upper(ArrayList<ArrayList<String>> arr){
        int count=0;
        int countRow=0;
        for(int i=0; i<arr.size();i++){
            countRow=0;
            for(int j=0; j<arr.get(i).size(); j++){
                 count=0;
                for(int k=0; k<arr.get(i).get(j).length(); k++)
                if((int)(arr.get(i).get(j).charAt(k))<90 || ((int)(arr.get(i).get(j).charAt(k))>65)){
                    count++;
                }
            }
            countRow+=count;
        }
        System.out.println(countRow);
    }
}
