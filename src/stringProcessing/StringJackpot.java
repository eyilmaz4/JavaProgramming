package stringProcessing;

import java.util.HashSet;

public class StringJackpot {
    public static void main(String[] args) {
        String [] str={"aaa","bbb", "ccc"};
        String [] str1={"aa","aa"};
        System.out.println(isJackpot(str));
        System.out.println(isJackpot(str1));

    }
    public static boolean isJackpot(String [] str){
        HashSet<String>hs=new HashSet<>();
        boolean isJackpot=true;
        for(String word:str){
            hs.add(word);
        }
        System.out.println(hs);
        if(hs.size()==str.length){
            isJackpot=false;
        }
        return isJackpot;
    }

    /*
    public static boolean isJackpot(String arr[]){
​
        String element=arr[0];
​
        for (int i = 0; i < arr.length ; i++) {
​
            if(!arr[i].equals(element)){
                return false;
            }
        }
        return true;
    }

     */
}
