//package collections;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class ReverseStringArrayList {
//    public static void main(String[] args) {
//        ArrayList<String> myWords=new ArrayList<>(Arrays.asList("abc","def"));
//       String temp="";
//       int arraySize=myWords.size();
//       int elementSize=myWords.get(0).length();
//        for(int i=0; i<myWords.size(); i++){
//            for(int j=0; j<myWords.get(i).length();j++){
//                temp+=myWords.get(i).charAt(elementSize-1);
//            }
//        }
//        ​
//import java.util.ArrayList;
//import java.util.Arrays;
//​
//        public class ReverseAll {
//            public static void main(String[] args) {
//                ArrayList<String> arr = new ArrayList<>(Arrays.asList("Java","is","Fun"));
//                for(int i = arr.size()-1 ; i>=0 ; i--){
//                    System.out.print(reverseStr(arr.get(i))+" ");
//                }
//​
//            }
//            public static String reverseStr(String str){
//                String reversed="";
//                for(int i=str.length()-1 ; i>=0 ; i--){
//                    reversed+=str.charAt(i);
//                }
//                return reversed;
//
//            }
//}
