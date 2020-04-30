package collections;

import java.util.HashMap;

public class SecondHM {
    public static void main(String[] args) {
        HashMap<String, Integer>newHM=new HashMap<>();
        newHM.put("Los Angeles",85);
        newHM.put("Chicago",30);
        newHM.put("Denver",55);
        newHM.put("Orlando",90);

        for(String keys:newHM.keySet()){
            System.out.println(keys+"\t\t\t\t\t"+newHM.get(keys));

        }
        int sum=0;

            for(int values:newHM.values()){
                 sum+=values;

            }
        System.out.println("average="+sum/newHM.size());
        }

    }

