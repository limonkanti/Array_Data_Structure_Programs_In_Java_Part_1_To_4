
package ArrayJavatpoint;

import java.util.*;
import java.util.List;


public class SortArrayAndInsertItem 
{
    
    public static void main(String args[]) 
    {
         List<Integer> al = new ArrayList<Integer>();
         al.add(1);
         al.add(2);
         al.add(3);
         al.add(4);
         int ar[]=new int[al.size()];
         for(int i=0;i<al.size();i++)
         {
             ar[i]=al.get(i);
         }
         for(int x:ar)
         {
             System.out.println(x);
         }
         al.add(1,5);
         int ar1[]=new int[al.size()];
         for(int i=0;i<al.size();i++)
         {
             ar1[i]=al.get(i);
         }
         for(int x:ar1)
         {
             System.out.println(x);
         }
    }
}
