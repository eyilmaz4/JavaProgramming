package stringProcessing;

import java.util.ArrayList;
import java.util.HashSet;

public class IsUnique {
    public static void main(String[] args) {
String str="abc";
isUnique(str);
        System.out.println(isUnique(str));
        String [] arr={"abc","aab", "cdr"};
        System.out.println(result(arr));
    }
    public static boolean isUnique(String str){
        HashSet<Character >hs=new HashSet<>();
      boolean result=false;
        for(int i=0; i<str.length(); i++){
            hs.add(str.charAt(i));
        }
        if (hs.size()==str.length()){
            result=true;
        }
        return result;
    }
    public static ArrayList<String> result(String [] arr){
      ArrayList<String>list=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(isUnique(arr[i])){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
