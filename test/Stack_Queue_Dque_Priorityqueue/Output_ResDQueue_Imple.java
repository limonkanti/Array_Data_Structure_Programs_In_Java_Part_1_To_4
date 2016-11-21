package Stack_Queue_Dque_Priorityqueue;

import java.util.Deque;
import java.util.LinkedList;

public class Output_ResDQueue_Imple {

    public static void main(String args[]) {
        Deque<Integer> queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        for (int x : queue) {
            System.out.print(x);
        }
        queue.addFirst(11);
        queue.addLast(12);
       
        System.out.println(queue);
        
       /*queue.removeFirst();
       queue.remove();*/
        
        queue.removeLast();
        
        System.out.println(queue);
        
        queue.removeLast();
        
        System.out.println(queue);

    }
}
