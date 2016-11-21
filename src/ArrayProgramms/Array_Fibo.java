
package ArrayProgramms;

import java.util.Scanner;

public class Array_Fibo 
{
     
    
   public static void main(String args[])
    {
        System.out.println("Please Enter the length");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
          a[0]=1;
          a[1]=1;
        for(int i=2;i<a.length;i++)
        {
            a[i]=a[i-2]+a[i-1];
               
        }
        System.out.println("First\t"+n+"\tnumbers of fibonacci numbers are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
       
        
    }
    
}
