
package ArrayProgramms;

import java.util.Scanner;


public class Octal_to_Decimal 
{
    
      public static void main(String args[])
    {
        System.out.println("Please enter a Octal number..");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,sum=0,k,temp;
        int quotient=n;
        int count=0;

          while(n!=0)
          {
               temp=n%10;
               sum=(int) (sum+temp*Math.pow(8, i));
               n=n/10;
               i++;
               
          }
          System.out.println(sum);
        
    }
}
