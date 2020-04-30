package collections;

import java.util.HashMap;

public class Elections {
    public static void main(String[] args) {
        String [] votes={"John","Jimmy", "Jackie", "Johny", "John"};
        HashMap<String, Integer> map= new HashMap<>();
        int num=1;
        for(int i=0; i<votes.length; i++){

            if (map.containsKey(votes[i])){
                map.put(votes[i],map.get(votes[i])+1);
            }
            else
            {
                map.put(votes[i], 1);
            }
        }
        System.out.println(map);
        int max=0;
        String winner=" ";
        for( String elements:map.keySet()){
            if(map.get(elements)>max){
                max=map.get(elements);
                winner=elements;

            }
        }
        System.out.println(winner+"has the most of the votes : "+max);
        System.out.println(map.get("John"));
    }

    /*import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
​
public class Candidates {
    public static void main(String[] args) {
        String[] candidates = {"Ferhat","Shohrat","Birsen","Ferhat","Shohrat","Birsen","Birsen","Birsen","Birsen"};
        System.out.println(findWinner(candidates));
    }
    public static String findWinner(String[] candidates){
        String winner="";
        HashMap<String,Integer> votes = new HashMap<>(10);
        for(String person : candidates){ //for(int i=0;
            if(votes.containsKey(person)){
                votes.put(person,votes.get(person)+1);
            }
            else{
                votes.put(person,1);
            }
        }
        //System.out.println(votes);
        Iterator totalVotes = votes.entrySet().iterator();
        String index="";
        int maxVote=0;
        String key;
        int value;
        while(totalVotes.hasNext()){
            Map.Entry mapEl = (Map.Entry)totalVotes.next(); //fetch the elements
            key = mapEl.getKey().toString();
            value = (int)mapEl.getValue();
            if(value>maxVote){
                maxVote=value;
                index=key;
            }
        }
        //System.out.println(index+"="+maxVote);
        winner="Winner is... "+ index+" with total "+maxVote + " votes ";
        return winner;
    }
}
Collapse



*/

}
