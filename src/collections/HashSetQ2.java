package collections;

import java.util.HashSet;

public class HashSetQ2 {
    public static void main(String[] args) {
        String sentence="Java is Java";
        String []arr=sentence.split(" ");
        HashSet<String>newH=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            newH.add(arr[i]);
        }
        System.out.println(newH);
    }
}
