package ArrayProgramms;

import java.util.Scanner;

public class Delete_Element_Specific_Position
{

    public static void main(String args[])
    {
        System.out.println("Please Enter total size of the array");
        int n, i, item;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ary[] = new int[n];
        System.out.println("Please Enter the elements");
        for (i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        System.out.println("The array elements are:\n");
        for (i = 0; i < n; i++) {
            System.out.println(ary[i]);
        }
        System.out.println("Please enter the position of the array which you want to delete:\n");
        int position = sc.nextInt();
        item = ary[position];
        for (int j = position; j < n - 1; j++) 
       {
            ary[j] = ary[j + 1];
       }
          n = n - 1;

        System.out.println("After deleting:\t" + n + "\t the array is:\n");
        for (i = 0; i < n; i++) {
            System.out.println(ary[i]);
        }

    }

}
