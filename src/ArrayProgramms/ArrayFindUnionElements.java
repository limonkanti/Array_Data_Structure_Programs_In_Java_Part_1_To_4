
package ArrayProgramms;

import java.util.TreeSet;


public class ArrayFindUnionElements 
{
    
    
      public static void main(String[] args)
    {
        int ar[]={1,2,3,4,5,2,7,1};
        
        TreeSet dupli=new TreeSet();
        TreeSet notdupli=new TreeSet();
        for(int i=0;i<ar.length;i++)
        {
           if(!dupli.contains(ar[i]))
           {
               notdupli.add(ar[i]);
           }
           else
           {
               dupli.add(ar[i]);
           }
        }
        System.out.println(notdupli);  
      
    }
}
