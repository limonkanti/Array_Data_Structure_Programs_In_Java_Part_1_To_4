package ArrayProgramms;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_Prime {

    public static void main(String args[]) {
        System.out.println("Please Enter the length");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b, j, counter;
        int a[];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < n; i++) {

            for (j = 2; j < i; j++);
            {
                if (i % j == 0)
                {

                    break;
                }
               
            }
             if (i == j) 
                {
                    list.add(i);
                }

        }

        for (int k : list) {
            System.out.print(k + "\t");
        }

    }

}
