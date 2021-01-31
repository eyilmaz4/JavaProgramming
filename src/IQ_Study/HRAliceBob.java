package IQ_Study;

import interfaces.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HRAliceBob {
    public static void main(String[] args) {
List<Integer>a=new ArrayList<Integer>(Arrays.asList(4,2,3,7,8,11));
List<Integer>b= new ArrayList<Integer>(Arrays.asList(3,3,4,1,0,13));

        System.out.println(compareTriplets(a,b));

    }
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer>result=new ArrayList<>();
        HashMap<String, Integer> son=new HashMap<>();
        son.put("Alice",0);
        son.put("Bob",0);
        int countA=0;
        int countB=0;
        for(int i=0; i<a.size(); i++){
            if(a.get(i)>b.get(i)){
                countA+=1;
                son.put("Alice",countA);

            }
            else if(a.get(i)<b.get(i)) {
               countB+=1;
                son.put("Bob",countB);
            }

        }
        result.add(son.get("Alice"));
        result.add(son.get("Bob"));

        return result;

    }
}
