package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SameDifferencesArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(2, 4, 6, 9, 12));

        sameDifference(myList);

        int myNums[] = {6,6,6,6,6,6,6,6,8,12,20};
                           System.out.println(findSameDifferences(myNums));
    }

    public static void sameDifference(ArrayList<Integer> Arr) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < Arr.size() - 1; i++) {
            for (int j = i + 1; j < Arr.size(); j++) {
                newList.add((Math.abs(Arr.get(i) - Arr.get(j))));
            }
        }
        System.out.println(newList);
        System.out.print("Same differences are:");
        for (int i = 0; i < newList.size() - 1; i++) {
            for (int j = i + 1; j < newList.size(); j++) {
                if (newList.get(i).equals(newList.get(j))) {
                    System.out.print(newList.get(i) + "\t");
                }
            }
        }
    }

                        public static ArrayList<Integer> findSameDifferences(int[] arr){
                            ArrayList<Integer> diffs = new ArrayList<>();
                            for(int i=0 ; i< arr.length ; i++){
                                for(int j=i+1 ; j<arr.length;j++){
                                    diffs.add(Math.abs(arr[i]-arr[j]));
                                }
                            }
                            diffs = findDuplicates(diffs);
                            return diffs;
                        }
                        public static ArrayList<Integer> findDuplicates(ArrayList<Integer> arr){
                            ArrayList<Integer> duplicates = new ArrayList<>();
                            for(int i=0 ; i<arr.size() ; i++) {
                                for (int j = i + 1; j < arr.size(); j++) {
                                    if (arr.get(i).equals(arr.get(j)) && !duplicates.contains(arr.get(i))) {
                                        duplicates.add(arr.get(i));
                                    }
                                }

                            }
                        return duplicates;

        }
    }
