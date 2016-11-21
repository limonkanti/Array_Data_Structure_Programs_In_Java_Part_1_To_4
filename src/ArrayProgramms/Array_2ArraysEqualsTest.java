
package ArrayProgramms;

import java.util.ArrayList;
import java.util.Arrays;


public class Array_2ArraysEqualsTest
{
    public static void main(String[] args)
    {
        int ar[]={1,2,3,4,5};
        int ar1[]={1,2,3,4,6};
        int j=0;
        for(int i=0;i<5;i++)
        {
            if(ar[i]==ar1[i])
            {
               j++;
            }
            else
            {
                j--;
            }
        }
       if(j==ar.length)
       {
           System.out.println("Equals");
       }
       else
       {
           System.out.println("Not Equals");
       }
        
    }
    
}
