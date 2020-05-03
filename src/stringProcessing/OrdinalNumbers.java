package stringProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class OrdinalNumbers {
    public static void main(String[] args) {

        System.out.println(findOrdinal(23));
        System.out.println(findOrdinal(42));
        System.out.println(findOrdinal(49));
        System.out.println(returnOrdinal(55));
    }
    public static String findOrdinal(int number){
        String num=""+number;
        char n=num.charAt(num.length()-1);
        System.out.println(n);
        switch(n){
            case('1'):
                return number+"st";
            case('2'):
                return number+"nd";
            case('3'):
                return number+"rd";
            case('4'):
                return number+"th";

        }
        return number+"th";


    }
    public static String returnOrdinal(int number){
        HashMap<Character,String> ordinals = new HashMap<>();
        ordinals.put('1',"ST");
        ordinals.put('2',"ND");
        ordinals.put('3',"RD");
        ordinals.put('4',"TH");
        String ordNumber = ""+number;
        char last = ordNumber.charAt(ordNumber.length()-1);
        for(char key : ordinals.keySet()){
            if(key == last){
                ordNumber+="-"+ordinals.get(key);
            }
        }
        return ordNumber;
    }

}
