
package ArrayMatrix;

import java.util.Scanner;


public class MatrixMultiplication 
{
     public static void main(String args[])
    {
        
        int i,j,k,m,n,p;
        int a[][]=new int[5][5];
        int b[][]=new int[5][5];
        int c[][]=new int[5][5];
       System.out.println("How many rows first column in second matrix");
       Scanner sc = new Scanner(System.in);
        p=sc.nextInt();
        System.out.println("How many columns Matrix A");
        m=sc.nextInt();
        System.out.println("How many rows of Matrix B");
        n=sc.nextInt();
        System.out.println("Please Enter the elements of the array A");
        for (i = 0; i < m; i++) 
        {
            for(j=0;j<p;j++)
            {
                a[i][j]=sc.nextInt();
                
            }
           
        }
    
        System.out.println("Please Enter the elements of the array of B");
        for (i = 0; i < p; i++) 
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
                
            }
           
        }
        System.out.println("The First Matrix is");
        for (i = 0; i < m; i++) 
        {
            for(j=0;j<p;j++)
            {
                System.out.print(a[i][j]+"\t");
                
            }
          System.out.println(); 
        }
        System.out.println("The Second Matrix is");
        for (i = 0; i < p; i++) 
        {
            for(j=0;j<n;j++)
            {
                System.out.print(b[i][j]+"\t");
                
            }
          System.out.println(); 
        }
   /*    System.out.println("The Matrix Multiplication operation :"); */
       for(i=0;i<m;i++)
       {
           for(j=0;j<n;j++)
           {
               c[i][j]=0;
               for(k=0;k<p;k++)
               {
                   c[i][j]=c[i][j]+a[i][k]*b[k][j];
               }
             
           }
       }
      System.out.println("The Matrix Multiplication is :"); 
       for(i=0;i<m;i++)
       {
           for(j=0;j<n;j++)
           {
                System.out.print(c[i][j]+"\t");
           }
           
            System.out.println(); 
       }
        
    }
    
}
