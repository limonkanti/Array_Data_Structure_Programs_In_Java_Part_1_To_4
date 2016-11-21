
package ArrayProgramms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Deci_To_Hexa 
{
      public static void main(String args[]) throws IOException
    {
      
        System.out.print("Enter a decimal number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
 int r;
       
        String s=""; //variable for storing the result
 
        //array storing the digits (as characters) in a hexadecimal number system
        char dig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
 
        while(n>0)
            {
                r=n%16;//finding remainder by dividing the number by 16
                
                s=dig[r]+s; //adding the remainder to the result
                n=n/16;
            }
        
        System.out.println("Output = "+s);
       
        
    }
    
}
