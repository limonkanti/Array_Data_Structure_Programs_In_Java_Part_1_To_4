
package ArrayInterViewCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupliNumber
{
    public static void main(String[] args) {

    int[] a = {3,5,5,8,9,9,9};

    ArrayList<Integer> hash = new ArrayList<Integer>();
     Set<Integer> set = new HashSet<Integer>();
     
      for(int i = 0; i < a.length; i++)
      {
           set.add(a[i]);
      }
     for(int x:set)
     {
         System.out.println(x);
     }
    
    }
    
}
