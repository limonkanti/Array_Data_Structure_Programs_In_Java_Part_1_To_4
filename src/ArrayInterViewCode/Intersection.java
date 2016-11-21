
package ArrayInterViewCode;

import java.util.ArrayList;


public class Intersection 
{
     public static void main(String[] args)
     {
         int a[]={1,2,3,4};
         int b[]={4,5,6,7,2};
         ArrayList<Integer> al=new ArrayList<Integer>();
         ArrayList<Integer> a2=new ArrayList<Integer>();
         for(int i=0;i<a.length;i++)
         {
             al.add(a[i]);
         }
         for(int i=0;i<b.length;i++)
         {
             a2.add(b[i]);
         }
         al.retainAll(a2);
         System.out.println(al);
     }
    
}
