
package Queue;
import java.util.*;

public class basicq1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // System.out.println(q);
       
        Queue<Integer> extra = new LinkedList<>();
        while(q.size()>0){
            System.out.println(q.peek()+"");
            extra.add(q.remove());
        }
        while(extra.size()>0){
            q.add(extra.poll());
        }

    }
}
