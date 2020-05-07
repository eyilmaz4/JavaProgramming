package queue_stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CeasarCipher {
    public static void main(String[] args) {


        Queue<Character> q = new LinkedList<>(Arrays.asList('k', 'n', 'o', 'w', 'l', 'e', 'd', 'g', 'e'));
        Queue<Character> p = new LinkedList<>();
        System.out.println(q);
        char c= (char)(q.peek()+3);
        for (int i=0; i<q.size();i++){
            p.add(c);
            q.poll();

        }
        System.out.println(p);
    }
    /*
    public class CeasarCipher {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(25);
        q.add(37);
        q.add(12);
​
        int value;
        for (int i = 0; i < 10 ; i++) {
            value = q.poll();
            System.out.print("Removed:"+value+"\tQueue:"+q);
            q.add(value);
            System.out.println("\t After added:"+q);
​
        }

     */
}