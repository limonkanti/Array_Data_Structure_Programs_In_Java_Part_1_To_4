
package ArrayProgrammsUsingLibrary;

import java.util.Arrays;


public class ArrayCopyElementsUsing_clone_Method 
{
    
    public static void main(String[] args) 
    {
        int ar[]={1,2,3,4};
        int b[]=ar.clone();
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        
    }
    
    
}
