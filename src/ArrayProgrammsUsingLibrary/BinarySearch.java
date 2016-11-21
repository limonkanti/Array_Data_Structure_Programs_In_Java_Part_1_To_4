
package ArrayProgrammsUsingLibrary;

import java.util.Arrays;


public class BinarySearch 
{
    public static void main(String args[])
    {
        int x[]={10,20,30,40,50}; 
        int l=Arrays.binarySearch(x, 30);
        System.out.println(l);
        System.out.println(Arrays.binarySearch(x, 100));
        
         
     
        
    }
    
}
