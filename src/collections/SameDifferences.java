package collections;

import java.util.ArrayList;

public class SameDifferences {
    public static void main(String[] args) {
int [] arr={2,4,6,5,9,13,17};
findSameDifferences(arr);
    }
    public static void findSameDifferences(int [] arr){
        ArrayList<Integer>newList=new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
           for(int j=i+1; j<arr.length; j++){
               newList.add((Math.abs(arr[i]-arr[j])));
           }
        }
        System.out.println(newList);
        for(int i=0; i<newList.size()-1; i++){
            for(int j=i+1; j<newList.size(); j++) {
                if (newList.get(i) == newList.get(j)) {
                    System.out.print(newList.get(i) + "\t");
                }
            }


        }
    }
    /*
    public class SameDifferences {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,6,3,2};
        findSameDifferences(arr);
    }
    public static void findSameDifferences(int arr[]){
        List<Integer> diffs = new ArrayList<>();
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print(arr[i]+" will be substracted with : ");
            for (int j = i+1 ; j < arr.length ; j++) {
                System.out.print(arr[j]+"\t");
                diffs.add(Math.abs(arr[i]-arr[j]));
            }
            System.out.println();
        }
        System.out.println(diffs);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int nums : diffs){
            if(hm.containsKey(nums)){
                hm.put(nums,hm.get(nums)+1);
            }
            else{
                hm.put(nums,1);
            }
        }
        for(int key : hm.keySet()){
            if(hm.get(key)>1){
                System.out.println("Difference : "+key+"\t Occurance : "+hm.get(key));
            }
        }
    }

     */
}
