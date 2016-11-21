
package ArrayInterViewCode;

import java.util.ArrayList;

public class MissingArrayNumberTest 
{
    
    public static void main(String args[])
    {
        ArrayList<Integer> arr=new  ArrayList<Integer>();
        int a[]={1,2,4,6,7,10};
        int j=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(j==a[i])
            {
                j++;
                continue;
                
            }
            else
            {
                arr.add(j);
                i--;
                j++;
            }
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
        
    }
}
