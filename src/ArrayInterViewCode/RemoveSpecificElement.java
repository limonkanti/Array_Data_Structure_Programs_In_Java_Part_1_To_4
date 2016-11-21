
package ArrayInterViewCode;

import java.util.ArrayList;
import java.util.Scanner;


public class RemoveSpecificElement 
{
    
     public static void main(String[] args)
     {
         int a[]={1,2,3,4};
         ArrayList<Integer> al=new ArrayList<Integer>();
         for(int i=0;i<a.length;i++)
         {
             al.add(a[i]);
         }
         System.out.println("The elements are:");
         System.out.println(al);
          System.out.println("Please enter a position which you want to remove from the list:");
          Scanner sc=new Scanner(System.in);
          int item =sc.nextInt();
          if(al.contains(item))
          {
            //  al.remove(item);
              al.remove(item);
          }
          System.out.println("After elements are:");
          for(int x:al)
          {
              System.out.println(x);
          }
         
     }
    
}
