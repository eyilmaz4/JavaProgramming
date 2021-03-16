package IQ_Study.albertCollections;

import java.util.*;

public class CollectionSort {
    public static void main(String[] args) {
//sort();
        sortCollect();
    }

    public static void sort() {
        List<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < 15; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Comparator.naturalOrder());
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        //Collections.sort(numbers, Collections.reverseOrder());
        //Collections.sort(numbers, Comparator.reverseOrder());
        Collections.sort(numbers, Comparator.naturalOrder());
        System.out.println(numbers);
    }

    public static void sortCollect() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(8, 0, 0, 1, 4, 5, 77, 2, 3, 8));
        System.out.println(list);
        //Collections.sort(list);
        //System.out.println(list);
       // Collections.sort(list, Comparator.naturalOrder());
        //System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list);
    }
}
