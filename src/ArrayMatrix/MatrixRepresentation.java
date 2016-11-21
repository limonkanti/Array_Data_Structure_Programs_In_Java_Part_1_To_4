
package ArrayMatrix;

import java.util.Scanner;

public class MatrixRepresentation
{
     public static void main(String args[])
    {
        System.out.println("Please Enter Total Row Size");
        int n, i=0, item,row,coloum,j=0;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
     
        System.out.println("Please Enter Total Coloum Size");
        coloum = sc.nextInt();
        int ary[][] = new int[row][coloum];
        System.out.println("Please Enter the elements of the array");
        for (i = 0; i < row; i++) 
        {
            for(j=0;j<coloum;j++)
            {
                ary[i][j]=sc.nextInt();
                
            }
           
        }
        System.out.println("The Matrix is");
        for (i = 0; i < row; i++) 
        {
            for(j=0;j<coloum;j++)
            {
                System.out.print(ary[i][j]+"\t");
                
            }
          System.out.println(); 
        }
        

    }
    
}
