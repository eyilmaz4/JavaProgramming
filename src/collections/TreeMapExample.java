package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<String, Integer> students = new TreeMap<>();
        students.put("vahit", 100);
        students.put("Shohrat", 100);
        students.put("Melih", 100);
        students.put("Rumeysa", 100);
        students.put("Ali", 100);
        System.out.println(students);

        Set<String> keys=students.keySet();
        Iterator<String> tree=keys.iterator();
        String key;
        while(tree.hasNext()){
            key=tree.next();
            System.out.println(key+"="+students.get(key));
        }
    }
}