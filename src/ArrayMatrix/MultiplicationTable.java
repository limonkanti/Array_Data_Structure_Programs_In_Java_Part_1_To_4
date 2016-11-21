
package ArrayMatrix;

import java.util.Scanner;

public class MultiplicationTable
{
      public static void main(String args[])
    {
        System.out.println("Please Enter Total Row Size of Matrix A");
        int n, i=0, item,row,coloum,j=0,sum=0,row1,coloum1,r,c;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
     
        System.out.println("Please Enter Total Coloum Size of Matrix A");
        coloum = sc.nextInt();
        int ary[][] = new int[row][coloum];
        
        System.out.println("The Multiplication table is:\n");
        for (i = 0; i <row; i++) 
        {
            r=i+1;
            for(j=0;j<coloum;j++)
            {
                c=j+1;
                ary[i][j]=r*c;
               System.out.print(ary[i][j]+"\t");
                
            }
           System.out.println(); 
        }
       
       
    }
    
}
