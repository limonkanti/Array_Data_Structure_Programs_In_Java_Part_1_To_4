
package ArrayProgramms;

import java.util.Arrays;
import java.util.Scanner;


public class Insert_Element 
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
        System.out.println("Please enter an element which you want to add to array:\n");
        int new_element = sc.nextInt();
        System.out.println("Please enter position of the array:\n");
        int position = sc.nextInt();
        for(i=ary.length-1;i>position;i--)
        {
            ary[i]=ary[i-1];
            
        }
       ary[position]=new_element;
      
       System.out.println(Arrays.toString(ary));

    }
    
}
