
package Stack_Queue_Dque_Priorityqueue;

import java.util.*;
import java.util.PriorityQueue;
//inputrestricted dqueue
public class Input_ResDQueue_Imple {
    public static void main(String args[])
     {
         Deque<Integer> queue=new LinkedList();
         
         queue.add(1);
         queue.add(2);
         queue.add(3);
         queue.addFirst(11);
        for(int x:queue)
        {
            System.out.print(x);
        }
       
        queue.add(4);
        queue.add(5);
       System.out.println(queue);
       queue.removeFirst();
       queue.removeFirst();
       System.out.println(queue);
       queue.removeLast();
       System.out.println(queue);
       
     }
    
}
