
package ArrayJavatpoint;

import java.util.*;

public class MergeArray 
{
    public static void main(String args[])
    {
        int ar[]={1,2,3};
        int ar2[]={4,5,6};
        List<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<ar.length;i++)
        {
            al.add(ar[i]);
        }
        System.out.println(al);
        List<Integer> al2=new ArrayList<Integer>();
        for(int i=0;i<ar2.length;i++)
        {
            al2.add(ar2[i]);
        }
        System.out.println(al2);
        al.addAll(al2);
        System.out.println(al);
    }
    
}
