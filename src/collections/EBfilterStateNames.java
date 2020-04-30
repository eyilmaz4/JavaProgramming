package collections;

import java.util.HashSet;

public class EBfilterStateNames {
    public static void main(String[] args) {
        String [] arr={"TX", "california","nevada"};
        filterNames(arr, "abb");
        filterNames(arr,"full");
    }
    public static void filterNames(String [] arr, String word){
        HashSet<String>hs=new HashSet<>();
        if(word=="abb"){
         for(int i=0; i<arr.length; i++){
             if(arr[i].length()==2){
                 hs.add(arr[i]);
             }

         }

        }
        else if(word=="full"){
            for(int i=0; i<arr.length; i++){
                if(arr[i].length()>2){
                    hs.add(arr[i]);
                }

            }

        }
        System.out.println(hs);
    }
}
