
package ArrayProgramms;

import java.util.Arrays;
import java.util.Scanner;


public class Copying_Array_Elements_to_Another 
{
    
    public static void main(String args[])
    {
        System.out.println("Please Enter total size of the array");
        int n, i, item;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ary[] = new int[n];
        System.out.println("Please Enter the elements");
        for (i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        System.out.println("The array elements are:\n");
        for (i = 0; i < n; i++) {
            System.out.println(ary[i]);
        }
        System.out.println("Copying ary to ary1");
        int ary1[] =new int[n];
        for(i=0;i<n;i++)
        {
            ary1[i]=ary[i];
        }
        System.out.println("After Copying ary1 is");
        for(i=0;i<n;i++)
        {
            System.out.println(ary1[i]);
        }

    }
    
}
