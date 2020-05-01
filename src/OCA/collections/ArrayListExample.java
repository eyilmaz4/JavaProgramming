package OCA.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
       List<String> cityList=new ArrayList<>();
       cityList.add("Phoenix");
       cityList.add("Seatle");
       //cityList.remove("Seatle");
       //cityList.clear();
       cityList.add("new york");
       if(cityList.contains("new york")){
           System.out.println("my arraylist has new york");
       }
        Collections.sort(cityList);
        System.out.println(" for each");
       for(String city:cityList){
           System.out.println(city);
       }
       //Collections.shuffle(cityList);

        System.out.println("for loop");
       for(int i=0; i<cityList.size(); i++){
           System.out.println(cityList.get(i));
       }


    }
}
