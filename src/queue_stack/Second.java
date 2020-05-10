package queue_stack;

import java.util.LinkedList;
import java.util.Queue;

public class Second {
    public static void main(String[] args) {
        Queue<Integer>myQ=new LinkedList<>();
        myQ.add(45);
        myQ.add(78);
        myQ.add(67);
        myQ.add(12);
        System.out.println(myQ);
        System.out.println("peek:"+myQ.peek());
        System.out.println("after peek"+myQ);
        System.out.println("with poll"+myQ.poll());
        System.out.println("after poll"+myQ);
        System.out.println(myQ.peek());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.remove());
    }
}
