
package ArrayMatrix;

import java.util.Scanner;


public class DiagonalMatrixSum
{
    
     public static void main(String args[])
    {
        /* diterminant 2*2 matrix=a*d-c*b */
        System.out.println("Please Enter Total Row Size of Matrix");
        int n, i=0, item,row,coloum,j=0,sum=0,row1,coloum1,diterminant;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
     
        System.out.println("Please Enter Total Coloum Size of Matrix");
        coloum = sc.nextInt();
        int ary[][] = new int[row][coloum];
        System.out.println("Please Enter the elements of the Matrix");
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
        System.out.println("The Diagonal Matrix is");
        for (i = 0; i < row; i++) 
        {
            for(j=0;j<coloum;j++)
            {
               if(i==j)
               {
                   sum=sum+ary[i][j];
               }  
            }
         
        } 
         System.out.println(sum); 
    }
    
}
