
package ArrayProgrammsUsingLibrary;

import java.util.Arrays;


public class ArrayCopyElementsUsing_copyOfMethod 
{
    
    public static void main(String[] args) 
    {
        int ar[]={1,2,3,4};
      //  int b[]=Arrays.copyOf(ar,ar.length);
         int b[]=Arrays.copyOf(ar,3);
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        
    }
}
