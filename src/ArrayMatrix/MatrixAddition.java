
package ArrayMatrix;

import java.util.Scanner;

public class MatrixAddition 
{
     public static void main(String args[])
    {
        System.out.println("Please Enter Total Row Size of Matrix A");
        int n, i=0, item,row,coloum,j=0,sum=0,row1,coloum1;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
     
        System.out.println("Please Enter Total Coloum Size of Matrix A");
        coloum = sc.nextInt();
        int ary[][] = new int[row][coloum];
        System.out.println("Please Enter the elements of the array A");
        for (i = 0; i < row; i++) 
        {
            for(j=0;j<coloum;j++)
            {
                ary[i][j]=sc.nextInt();
                
            }
           
        }
        //
        System.out.println("Please Enter Total Row Size of Matrix B");
        row1 = sc.nextInt();
        System.out.println("Please Enter Total Coloum Size of B");
        coloum1 = sc.nextInt();
        int ary2[][] = new int[row1][coloum1];
        System.out.println("Please Enter the elements of the array of B");
        for (i = 0; i < row1; i++) 
        {
            for(j=0;j<coloum1;j++)
            {
                ary2[i][j]=sc.nextInt();
                
            }
           
        }
        System.out.println("The First Matrix is");
        for (i = 0; i < row; i++) 
        {
            for(j=0;j<coloum;j++)
            {
                System.out.print(ary[i][j]+"\t");
                
            }
          System.out.println(); 
        }
        System.out.println("The Second Matrix is");
        for (i = 0; i < row; i++) 
        {
            for(j=0;j<coloum;j++)
            {
                System.out.print(ary[i][j]+"\t");
                
            }
          System.out.println(); 
        }
       int ary3[][]=new int[row][coloum]; 
       for(i=0;i<row;i++)
       {
           for(j=0;j<coloum;j++)
           {
               ary3[i][j]=ary[i][j]+ary2[i][j];
           }
       }
       System.out.println("The Addition is:");
        for(i=0;i<row;i++)
       {
           for(j=0;j<coloum;j++)
           {
                System.out.print(ary3[i][j]+"\t");
           }
           
            System.out.println(); 
       }
        
    }
       
}
