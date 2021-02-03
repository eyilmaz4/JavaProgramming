package IQ_Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HR_birthdayCake {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,4,4));

        System.out.println(candle(list));
    }
    public static int candle(List<Integer> candles){
        int max=0;
        int count=0;
        for(int i=0; i<candles.size(); i++){
            if(candles.get(i)>=max){
                max=candles.get(i);

            }
        }
        for (int a:candles) {
        if(a==max){
            count++;
        }
        }
        return count;
    }
}
