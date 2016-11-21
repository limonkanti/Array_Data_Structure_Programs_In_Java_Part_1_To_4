
package ArrayProgrammsUsingLibrary;

import java.util.Arrays;

public class Copy_one_arrayElementsSpecificRange_to_anotherArray
{
     public static void main(String args[])
    {
        int x[]={1,2,3,4,5};
        int y[]=Arrays.copyOfRange(x, 2, 5);
        for(int k=0;k<y.length;k++)
        {
            System.out.println(y[k]);
        }
        //
         System.out.println("Using for each loop");
         for(int i:y)
         {
              System.out.println(i);
         }
     
        
    }
    
}
