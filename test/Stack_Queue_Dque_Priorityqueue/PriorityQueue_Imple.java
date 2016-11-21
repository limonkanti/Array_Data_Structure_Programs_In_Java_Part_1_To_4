
package Stack_Queue_Dque_Priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue_Imple 
{
     public static void main(String args[])
     {
         PriorityQueue<Integer> pq=new PriorityQueue<Integer>(5);
         
         pq.add(3);
         pq.add(1);
         pq.add(5);
         pq.add(2);
         pq.add(4);
     //   System.out.println(pq.peek());
      //  System.out.println(pq.element());
      
       //  pq.remove();
         System.out.println(pq);
        // pq.remove();
       //  System.out.println(pq);
        
     }
    
}
