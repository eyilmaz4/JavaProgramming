package collections;

import java.util.*;

public class CollectionsAddAllFruits {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
            Collections.addAll(fruit,"Apple", "Banana", "Strawberry");
            fruit.forEach(System.out::println);



    }
}