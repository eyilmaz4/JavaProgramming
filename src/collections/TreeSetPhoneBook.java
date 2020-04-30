package collections;

import java.util.*;

public class TreeSetPhoneBook {
    public static void main(String[] args) {
        phoneBook(1234567891, "Esra");
        System.out.println();

        TreeSet<String> phoneBook = new TreeSet<String>(Arrays.asList("Jon Doe : 567 345 3377"));
        System.out.println(phoneBook);
        List<String> names = new ArrayList<>(Arrays.asList("Brad Pitt : 555 555 5555","Bill Gates : 234 544 2323","James Gosling : 344 563 2356"));
        phoneBook.addAll(names);
        System.out.println(phoneBook);
        Iterator<String> iterator = phoneBook.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void phoneBook(int number, String name) {
        TreeSet<String> ts = new TreeSet<>();
       // ts.add(name);
        String num = "";
        String nums = num + number;
        String numbers = "";
        for (int i = 0; i < 3; i++) {
            numbers += nums.charAt(i);

        }
        ts.add(numbers);
        String numbers2 = "";
        for (int i = 3; i < 6; i++) {
            numbers2 += nums.charAt(i);
        }
        String numbers3 = "";
        ts.add(numbers2);
        for (int i = 6; i < nums.length(); i++) {
            numbers3 += nums.charAt(i);
        }
        ts.add(numbers3);
        System.out.println(ts);

        Iterator<String> iter = ts.iterator();
        System.out.print(name+":");
        while (iter.hasNext()) {
            System.out.print(iter.next()+"\t");
        }


    }




}
