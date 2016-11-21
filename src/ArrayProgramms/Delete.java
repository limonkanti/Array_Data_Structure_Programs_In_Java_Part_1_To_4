
package ArrayProgramms;

import java.util.Scanner;


public class Delete {
       
   public static void main(String args[])
    {
        int ar[]={3,4,5,2,1};
        int n=ar.length;
        int position=1,temp;
        for( int i=position;i<n-1;i++)
        {
            ar[i]=ar[i+1];
            
        }
        n=n-1;
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
    }
    
}
