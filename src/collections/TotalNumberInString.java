package collections;

import java.util.Arrays;
import java.util.LinkedList;

public class TotalNumberInString {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>(Arrays.asList("abc1", "def2", "ghi3"));

       int total=0;
       String num="";
        for(String str:list){
            for(int i=0; i<str.length(); i++){
                if(Character.isDigit(str.charAt(i))){
                   num+=str.charAt(i);
                    System.out.print(num+"\t");
                    total+=Integer.parseInt(num);
                }
                num="";
            }
        }
        System.out.println("total:"+total);
    }
}
