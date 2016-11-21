
package ArrayProgrammsUsingLibrary;

import java.util.Arrays;


public class ArrayCopyRange 
{
     
    public static void main(String[] args) 
    {
        int ar[]={1,2,3,4};
      //  int b[]=Arrays.copyOf(ar,ar.length);
         int b[]=Arrays.copyOfRange(ar,1,4);
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        
    }
    
}
