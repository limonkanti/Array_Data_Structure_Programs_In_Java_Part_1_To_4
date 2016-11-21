package ArrayInterViewCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SearchElement {

    public static void main(String args[]) 
    {

        int a[] = {1, 3, 3, 4, 5, 6, 7, 7, 10};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++)
        {

            arr.add(a[i]);

        }
       
        System.out.println("Please enter an element to search");
        Scanner sc=new Scanner(System.in);
        int item=sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(item);
        if(arr.contains(item))
        {
            System.out.println("Yes!!!Found");
        }
        else
        {
            System.out.println("Not Found");
        }
        

    }

}
