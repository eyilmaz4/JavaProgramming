package collections;

import java.util.LinkedList;

public class LinkedListQ1 {
    public static void main(String[] args) {
        LinkedList<String> myLink = new LinkedList<>();
        LinkedList<String> myList = new LinkedList<>();

        myLink.add("Java");
        myLink.add("is");
        myLink.add("fun");
        myLink.add("isn't");
        myLink.add("it");
        myLink.add("yes, always");
        myList.add("1 banana");
        myList.add("2 apple");
        myList.add("3 pear");

        findLongest(myLink);
        //findShortest(myLink);
        findTotal(myLink);
        findNums(myList);
    }

    public static void findLongest(LinkedList<String> arr) {
        int max = 0;
        String longest = "";
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > max) {
                max = arr.get(i).length();
                longest = arr.get(i);
            }
        }
        System.out.println("longest element --" + longest + "-- has" + max + " letters ");
//
//     public static void main(String[] args) {
//            LinkedList<String> myList = new LinkedList<>(Arrays.asList("Java","is","always","super","fun"));
//            int longest=0;
//            int index=0;
//            for (int i = 0; i <myList.size() ; i++) {
//                if(myList.get(i).length()>longest){
//                    longest=myList.get(i).length();
//                    index=i;
//                    System.out.println(myList.get(i));
//                }
//            }
        //System.out.println("The longest word is : "+myList.get(index));


    }
    //my shortest not working

//    public static void findShortest(LinkedList<String> arr) {
//        int min = 0;
//        String shortest = "";
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i).length() <= min) {
//                min = arr.get(i).length();
//                shortest = arr.get(i);
//            }
//        }
//        System.out.println("shortest element --" + shortest + "-- has" + min + " letters ");


    public static void findShortestWord(LinkedList<String> arr){
        int shortest=arr.get(0).length();
        String shortestWord="";
        for(int i=1 ; i<arr.size() ; i++){
            if(arr.get(i).length()<shortest){
                shortest=arr.get(i).length();
                shortestWord=arr.get(i);
            }
        }
        System.out.println("The shortest word is : "+shortestWord);
    }
public static void findTotal(LinkedList<String>arr){
        int sum=0;
        for(int i=0; i<arr.size(); i++){
            sum+=arr.get(i).length();
        }
    System.out.println(arr);
    System.out.println("total:"+sum);
}
public static void findNums(LinkedList<String>arr){
       int total=0;
        int value;
        for(String word:arr){ //fetch word
for(int i=0; i<word.length(); i++){
    if(Character.isDigit(word.charAt(i))){
        value=word.charAt(i)-48;
        total+=value;
    }
}
}
    System.out.println(total);
       }

//hocanin cozumu
//    public static void findDigits(LinkedList<String> arr){
//        int total=0;
//        int value;
//        String x="";
//        for(String word : arr){
//            for(int i=0 ; i<word.length() ; i++){
//                if(Character.isDigit(word.charAt(i))){
//                    x+=word.charAt(i);
//                    value=Integer.parseInt(x);
//                    total+=value;
//                    x="";
//                }
//            }
//        }
//        System.out.println(total);
//​
//    }
//    public static void findDigits(LinkedList<String> arr,boolean x){
//        int total=0;
//        int value;
//        for(String word : arr){ //fetch the words
//            for(int i=0 ; i<word.length() ; i++){ //to fetch chars
//                if(Character.isDigit(word.charAt(i))){
//                    value=word.charAt(i)-48;
//                    total+=value;
//                }
//            }
//        }
//        System.out.println(total);
//​


    }