
package ArrayProgramms;

import java.util.Scanner;

public class Binary_to_all_using_library 
{
    public static void main(String argsgg[])
    {
        //bi to deci
        System.out.println("Please enter a binary number");
        Scanner sc=new Scanner(System.in);
        String binary=sc.nextLine();
        System.out.println("The Decimal conversion is:\n"+Integer.parseInt(binary, 2));
        
        //bi to octa
        
       // System.out.println("Please enter a binary number");
       // Scanner sc1=new Scanner(System.in);
       // String octa=sc.nextLine();
        int l=Integer.parseInt(binary,2);
        System.out.println("The octal conversion is:\n"+Integer.toOctalString(l));
        
        
        int h=Integer.parseInt(binary,2);
        String hex=Integer.toString(h,16);
        System.out.println("The octal conversion is:\n"+hex);
        
        
        
        
        
    }
}
          
    
    
    
    
    
    
    
  