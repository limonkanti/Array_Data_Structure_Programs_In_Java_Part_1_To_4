
package ArrayProgramms;

import java.util.ArrayList;


public class ArraySeparateZero 
{
    public static void main(String[] args)
    {
        int ar[]={1,2,3,4,0,5,0,7,0};
        ArrayList al=new ArrayList();
        ArrayList al2=new ArrayList();
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                al2.add(ar[i]);
            }
            else
            {
                al.add(ar[i]);
            }
        }
        System.out.println(al);
        al.addAll(al2);
        System.out.println(al);
        int ar2[]={1,2,3,4,0,5,0,7,0};
  //      System.out.println("Display");
        
   //  System.out.println(12+(22));
        
        
    }
    
}
