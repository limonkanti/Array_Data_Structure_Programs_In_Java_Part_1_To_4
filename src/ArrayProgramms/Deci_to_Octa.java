
package ArrayProgramms;

import java.util.Scanner;


public class Deci_to_Octa 
{
    
      
    public static void main(String args[])
    {
        System.out.println("Please enter a Decimal number..");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int quotient=n;
        int count=0;
        int a[]=new int[10];
        while(quotient!=0)
        {
            a[i++]=quotient%8;
            count++;
            quotient=quotient/8;
        }
        for(i=count-1;i>=0;i--)
        {
            System.out.print(+a[i]+"\t");
        }
       
        
    }
}
