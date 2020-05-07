package queue_stack;

import java.util.LinkedList;
import java.util.Queue;

public class Names {
    public static void main(String[] args) {
    Queue<String>myQ=new LinkedList<>();
    myQ.add("Ahmet");
    myQ.add("Mehmet");
    myQ.add("Abdullah");
    myQ.add("Hasan");
    myQ.add("Huseyin");
    myQ.add("Hans");

        System.out.println(myQ);
        System.out.println(myQ.peek());
        myQ.poll();
        System.out.println(myQ);
    }
}
