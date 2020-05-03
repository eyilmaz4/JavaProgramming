package stringProcessing;

import java.util.ArrayList;

public class SumNumbers {
    public static void main(String[] args) {

    }

    public static int sumNumbers(String number){
        String num="";
        char ch;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < number.length() ; i++) {
            ch = number.charAt(i);
            if(Character.isDigit(ch)){
                for (int j = i; j < number.length()  ; j++) {
                    ch = number.charAt(j);
                    num += ch;
                    if(!Character.isDigit(ch)){
                        System.out.println("i:"+i+"j:"+j+"num:"+num);
                        list.add(Integer.parseInt(num.substring(0,num.length()-1)));
                        num="";
                        i=j;
                        break;
                    }
                }
                System.out.println(list);
            }
        }
        //System.out.println(list);
        int result=0;
        for(int digits : list){
            result += digits;
        }
        return result;
    }
}