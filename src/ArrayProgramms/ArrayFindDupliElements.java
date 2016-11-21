
package ArrayProgramms;

import java.util.*;


public class ArrayFindDupliElements 
{
    
      public static void main(String[] args)
    {
        int ar[]={1,2,3,4,5,2,7,1};
        
        TreeSet dupli=new TreeSet();
        TreeSet notdupli=new TreeSet();
        for(int i=0;i<ar.length;i++)
        {
           if(!notdupli.contains(ar[i]))
           {
               notdupli.add(ar[i]);
           }
           else
           {
               dupli.add(ar[i]);
           }
        }
        System.out.println(dupli);  
      
    }
}
