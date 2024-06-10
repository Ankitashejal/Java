package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.isEmpty());
        queue.add(2);
        queue.add(4);
        queue.add(6);

        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.size());
        // System.out.println(queue.remove());
       queue.poll(); //removend this are same
       System.out.println(queue);
       System.out.println(queue.peek());
    }
}
