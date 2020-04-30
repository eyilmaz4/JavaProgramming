package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TwoDimTenWindow {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println(list);
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                list.get(i).add(j, ((int) (Math.random()*100)));
            }
        }
        System.out.println(list);
        Iterator<ArrayList<Integer>> iter=list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        multiplication(list,2);

    }
    public static void multiplication(ArrayList<ArrayList<Integer>>arr, int num){
        for(ArrayList<Integer> rows:arr){
            for(int col:rows){
                System.out.print(col*num+"\t");
            }
            System.out.println();
        }
    }
    /*
    public class TwoDimArrayQuestion {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++) { //rows
            numbers.add(new ArrayList<>());
            for (int j = 0 ; j < 10 ; j++) { //elements in a row
                numbers.get(i).add((int)(Math.random()*100));
            }
        }
        Iterator<ArrayList<Integer>> iter = numbers.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("----------------------------");
        multiplyWithConstant(numbers,10);
        int[]window = {2,3};
        System.out.println("----------------------------");
        multiplyWithArray(numbers,window);
    }
    public static void multiplyWithConstant(ArrayList<ArrayList<Integer>> arr,int constant){
        int result;
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.get(i).size() ; j++) {
                result=arr.get(i).get(j)* constant;
                arr.get(i).set(j,result);
            }
        }
        Iterator<ArrayList<Integer>> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static  void multiplyWithArray(ArrayList<ArrayList<Integer>> arr, int[] window){
        int increment = window.length;
        int result;
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.get(i).size(); j+=increment) {
                //System.out.println("j="+j);
                result=arr.get(i).get(j)*window[0];
                arr.get(i).set(j,result);
                result=arr.get(i).get(j+1)*window[1];
                arr.get(i).set(j+1,result);
            }
        }
        Iterator<ArrayList<Integer>> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

     */
}