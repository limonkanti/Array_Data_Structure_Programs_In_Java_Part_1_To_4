
package ArrayProgrammsUsingLibrary;

import java.util.Arrays;

public class fill 
{
     public static void main(String args[])
    {
        int x[]={10,20,30,40,50};
         
        Arrays.fill(x, 1);
         System.out.println("Using for each loop");
         for(int i:x)
         {
              System.out.println(i);
         }
     
        
    }
    
}
