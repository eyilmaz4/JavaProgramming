package stringProcessing;

import java.util.LinkedList;

public class DoubleLetters {
    public static void main(String[] args) {
        System.out.println(idDoubleLetters("loop"));
        System.out.println(idDoubleLetters("neet"));
        System.out.println(idDoubleLetters("please"));
        System.out.println(idDoubleLetters("pencil"));
        System.out.println(idDoubleLetters("zoom"));
    }
    public static boolean idDoubleLetters(String str){
        char arr[]=str.toCharArray();
        boolean result=false;
        for(int i=0; i<arr.length-1; i++) {

                if (arr[i] == arr[i+1]) {
                    result = true;
                }
            }

        return result;
    }
    /*
     public static boolean isConsIdent(String str){
        for (int i = 0; i < str.length()-1 ; i++) {
            if(str.charAt(i)==str.charAt(i+1))
                return true;
        }
        return false;
    }

     */
}
