package collections;

import java.util.Hashtable;

public class HashTableQ2 {
    public static void main(String[] args) {
        Hashtable<Integer, Integer>ht=new Hashtable<>();
        for(int i=0; i<11; i++){

            ht.put((i),(i*2));
        }
        System.out.println("firstL"+ht);
        for(int i=0; i<ht.size(); i++){
            if(ht.get(i)>7){
                ht.remove(i);
            }

        }
        System.out.println(ht);
    }
    /*

Bilbil Rejepova  1:18 PM
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> digists= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Iterator<Integer> iterator = digists.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

Mustafa Duran  1:21 PM
Untitled
package collections;
​
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
Click to expand inline (21 lines)



maral ommadova  1:39 PM
so its random as well right?
1:43
its starts from the end..
Screen Shot 2020-04-19 at 14.42.39.png
Screen Shot 2020-04-19 at 14.42.39.png


:ok_hand:
1


melih  1:43 PM
Untitled
        Hashtable<Integer , String> table = new Hashtable<>();
        table.put(1,"one");
        table.put(2,"two");
        table.put(3,"three");
        table.put(4,"four");
Click to expand inline (13 lines)



Bilbil Rejepova  1:43 PM
package April19;
import java.util.Hashtable;
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
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
}

Vahit Cimen  1:43 PM
package collections;
import java.util.Hashtable;
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
       // Hashtable<Integer,Hashtable<Integer>> ht = new Hashtable<>(); possible
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
}

Birsen  1:44 PM
Screen Shot 2020-04-19 at 2.44.16 PM.png
Screen Shot 2020-04-19 at 2.44.16 PM.png



Erdem  1:44 PM
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String>table=new Hashtable<>();
        table.put(0,"zero");
        table.put(1,"one");
        table.put(2,"two");
        table.put(3,"three");
        table.put(4,"foue");
        table.put(5,"five");
        table.put(6,"six");
        table.put(7,"seven");
        table.put(8,"eight");
        table.put(9,"nine");
        System.out.println(table);
    }
}

Esra Y  1:45 PM
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
}

Berdi  1:45 PM
public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable();
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
}

melih  1:48 PM
Untitled
    public static void main(String[] args) {
        Hashtable<Integer , String> table = new Hashtable<>();
        String str = "one two three four five six seven eight nine";
        String[] arr = str.split(" ");
Click to expand inline (11 lines)



nihalM  1:54 PM
image.png
image.png



Esra Y  2:23 PM
line 20; keys is the name we are giving or keyword? i coudnt understand this line
2:25
yes thank you

Mustafa Duran  2:27 PM
Untitled
package collections;
​
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
​
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        String numbers = "zero one two three four five six seven eight nine";
        String[] numbersArray = numbers.split(" ");
        for (int i = 0 ; i < numbersArray.length ; i++){
            ht.put(i,numbersArray[i]);
        }
        //System.out.println(ht);
        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3,"three");
        //System.out.println(ht);
        Set<Integer> keys = ht.keySet();
        Iterator<Integer> iter = keys.iterator();
        int key;
        while(iter.hasNext()){
            key=iter.next();
            System.out.println(key+" = "+ht.get(key));
        }
    }
}
Collapse




Bilbil Rejepova  2:38 PM
I didn’t understand?
2:38
could explain again
2:39
better

melih  2:41 PM
i tried foreach and iterator.nex() both give error
2:42
for (Integer i : table.keySet()) {
    if ( i>7 ) table.remove(i);
}
Iterator<Integer> iterator = table.keySet().iterator();
while (iterator.hasNext()){
    if (iterator.next() > 7 ) table.remove(iterator.next());
}

Shohrat  2:47 PM
yes it is sorted

Shohrat  2:54 PM
100 without first 1 :slightly_smiling_face:

melih  2:56 PM
        TreeMap<String, Integer> tree = new TreeMap<>();
        tree.put("Vahit",100);
        tree.put("Shohrat",100);
        tree.put("Rumeyse",100);
        tree.put("Melih",100);
        tree.put("Ali",100);
        System.out.println(tree);
(edited)
2:57
image.png
image.png



Esra Y  2:58 PM
image.png
image.png



Berdi  2:59 PM
   public static void main(String[] args) {
        TreeMap<String, Integer> tree = new TreeMap<>();
        tree.put("Vahit",100);
        tree.put("Shohrat",100);
        tree.put("Rumeyse",100);
        tree.put("Melih",100);
        tree.put("Ali",100);
    //System.out.println(ht);
    Set<String> keys = tree.keySet();
    Iterator<String> iter = keys.iterator();
    String key;
        while (iter.hasNext()) {
        key = iter.next();
        System.out.println(key + " = " + tree.get(key));
    }
}
}

melih  2:59 PM
iterator gives error
image.png
image.png



Birsen  3:00 PM
Screen Shot 2020-04-19 at 4.00.19 PM.png
Screen Shot 2020-04-19 at 4.00.19 PM.png



Mustafa Duran  3:01 PM
Previous example...I fixed it
3:02
Untitled
package collections;
​
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
​
public class RemoveWithIeration {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> numbers = new Hashtable<>(20);
        for (int i = 0; i < 11 ; i++) {
            numbers.put(i,i*2);
        }
        System.out.println(numbers);
​
        Enumeration<Integer> iter = numbers.keys();
​
        while(iter.hasMoreElements()){
            Integer key=iter.nextElement();
            if(key>7){
                numbers.remove(key);
            }
        }
        System.out.println(numbers);
    }
*/
}
