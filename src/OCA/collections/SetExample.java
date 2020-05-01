package OCA.collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> citySet=new HashSet<>();
        citySet.add("ankara");
        citySet.add("istanbul");
        citySet.add("sakarya");

        Set<String>cityTreeSet=new TreeSet<>();
        cityTreeSet.add("ankara");
        cityTreeSet.add("istanbul");
        cityTreeSet.add("sakarya");
        for(String city: citySet){
            System.out.println(city);
        }
        String map="ad";


        }
    }
