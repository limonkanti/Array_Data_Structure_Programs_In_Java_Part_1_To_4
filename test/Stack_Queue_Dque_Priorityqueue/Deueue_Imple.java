
package Stack_Queue_Dque_Priorityqueue;

import java.util.Deque;
import java.util.LinkedList;


public class Deueue_Imple
{
    public static void main(String args[])
    {
        Deque<Integer> queue=new LinkedList();
        queue.offer(44);
        queue.addFirst(1);
        queue.addFirst(2);
        
        System.out.println(queue);
        queue.addFirst(11);
        queue.addFirst(22);
        System.out.println(queue);
        queue.removeLast();
        System.out.println(queue);
        System.out.println(queue.peek());
        
    }
    
}
