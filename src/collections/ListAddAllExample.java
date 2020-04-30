package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAddAllExample {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        Collections.addAll(fruits,"Apple", "Orange", "Banana", "Strawberry", "Watermelon");
   fruits.forEach(System.out::println);
    }
}
