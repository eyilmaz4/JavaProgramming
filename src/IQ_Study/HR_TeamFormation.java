package IQ_Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HR_TeamFormation {
    public static void main(String[] args) {

    List<Integer>t=new ArrayList<>(Arrays.asList(4,5,6,10,12,13));

        List<Integer>t2=new ArrayList<>(Arrays.asList(4,5,6,10,12,13,3,8,17));
        System.out.println(teamFormat(t,3,4,10));
    }
    public static long fact(int n){
        int number = n;
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    public static int teamFormat(List<Integer>skills, int minPlayer, int minLevel, int maxLevel){
        List<Integer>list=new ArrayList<>();
        for (int player:skills
             ) {
            if(player>=minPlayer && player<=maxLevel){
                list.add(player);
            }
//4 6 5 10
        }

        int n = list.size();
        int sum = 0;
        for (int i = minPlayer; i <= n; i++) {
            sum += fact(n) / (fact(n-i) * fact(i)) ;
        }
       return sum;
    }


        }

