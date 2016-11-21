package ArrayProgramms;

import java.util.Scanner;

public class GCD_Of_N_Numbers {

    public static void main(String args[]) {
        int r,i,j;
        System.out.println("Please Enter the number of m");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int ary[] = new int[m];
        System.out.println("Please Enter the elements");
        for ( i = 1; i <= m; i++) {
            ary[i] = sc.nextInt();
        }
        for (i = 1; i <= m - 1; i++)
        {
            for (j = 1; j <= m; j++) 
            {
                while (ary[j+1]!= 0)
                {
                    r =ary[j]%ary[j+1];
                    ary[j]=ary[j+1];
                     ary[j+1]=r;
              
                }

            }
             System.out.println(ary[j]);
        }
        
       

    }

}
