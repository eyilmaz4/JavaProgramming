package collections;

import java.util.HashMap;
import java.util.Iterator;

public class VotingHM {
            public static void main(String[] args) {
                String [] votes={"john", "johnny", "jackie",
                        "johnny", "john", "jackie",
                        "jamie", "jamie", "john",
                        "johnny", "jamie", "johnny",
                        "john","john"};
                winner(votes);
            }
            public static void winner(String [] votes){
                HashMap<String, Integer>hm=new HashMap<>();
                for(String names:votes){
                    if(hm.containsKey(names)){
                        hm.put(names,hm.get(names)+1);
                    }
                    else {
                        hm.put(names,1);
                    }
                }
                System.out.println(hm);

                int max=0;
                String winner="";
                for(String keys:hm.keySet()){
                    if(hm.get(keys)>max){
                        max=hm.get(keys);
                        winner=keys;
                    }
                }
                System.out.println("winner is:"+winner+" with total "+max+" number of votes");
                }
    }

