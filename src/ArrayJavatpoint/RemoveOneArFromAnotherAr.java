
package ArrayJavatpoint;

import java.util.*;

public class RemoveOneArFromAnotherAr
{
    
    public static void main(String args[])
    {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ArrayList<Integer> ar2=new ArrayList<Integer>();
        ar2.add(1);
        ar.removeAll(ar2);
        System.out.println(ar);
        
        
    }
}
