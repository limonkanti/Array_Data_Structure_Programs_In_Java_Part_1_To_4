
package ArrayProgramms;

import java.util.ArrayList;

public class ArrayIntersection 
{
    public static void main(String[] args)
    {
        int ar[]={1,2,3,4,5};
        int ar1[]={1,4,9,10,11};
        int j=0;
        ArrayList al=new ArrayList();
        ArrayList al2=new ArrayList();
        for(int i=0;i<5;i++)
        {
            for(j=0;j<ar1.length;j++)
            {
                 if(ar[i]==ar1[j])
                 {
                     al.add(ar[i]);
                 }     
               
            }    
        }
        System.out.println(al);  
      
    }
    
    
}
