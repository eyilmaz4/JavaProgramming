package HomeworkChallanges;

import java.util.Arrays;

//Reverse Array without using another array. (Array itself)
public class ReverseArray {
    public static void main(String[] args) {
        String [] sentence={"J", "a","v", "a"};
reverseArray(sentence);
        System.out.println(reverseString("hello world"));
    }
    public static void reverseArray( String [] array){
String [] reversedArr=new String [array.length];
int index=0;
for(int i=array.length-1; i>=0; i--){
    reversedArr[index]=array[i];
    index++;

}

        System.out.println(Arrays.toString(reversedArr));

for(String words:reversedArr){
    System.out.print(words);
}
    }

    public static String reverseString(String sentence){
      String result=" ";

        for(int i=sentence.length()-1; i>=0; i--){
           result+=sentence.charAt(i);
        }
        return result;
    }
}
