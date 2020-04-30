package collections;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht= new Hashtable<>();
        ht.put(0,"zero");
        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3,"three");
        ht.put(4,"four");
        ht.put(5,"five");
        ht.put(6,"six");
        ht.put(7,"seven");
        ht.put(8,"eight");
        ht.put(9,"nine");
        System.out.println(ht);
    }
//   // /*
//    import java.util.Hashtable;
//import java.util.Iterator;
//import java.util.Set;
//​
//public class HashTableExample {
//    public static void main(String[] args) {
//        Hashtable<Integer,String> ht = new Hashtable<>();
//        String numbers = "zero one two three four five six seven eight nine";
//        String[] numbersArray = numbers.split(" ");
//        for (int i = 0 ; i < numbersArray.length ; i++){
//            ht.put(i,numbersArray[i]);
//        }
//        //System.out.println(ht);
//        ht.put(1,"one");
//        ht.put(2,"two");
//        ht.put(3,"three");
//        //System.out.println(ht);
//        Set<Integer> keys = ht.keySet();
//        Iterator<Integer> iter = keys.iterator();
//        int key;
//        while(iter.hasNext()){
//            key=iter.next();
//            System.out.println(key+" = "+ht.get(key));
//        }
//    }
//}











}
