
package ArrayProgrammsUsingLibrary;

import java.util.Arrays;


public class Copy_one_arrayElements_to_anotherArray
{
    
    public static void main(String args[])
    {
        int x[]={1,2,3};
        int y[]=Arrays.copyOf(x,3);
        
        for(int k=0;k<y.length;k++)
        {
            System.out.println(y[k]);
        }
        
            
     
        
    }
}
