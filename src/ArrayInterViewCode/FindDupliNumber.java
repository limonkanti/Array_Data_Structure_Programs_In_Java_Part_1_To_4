package ArrayInterViewCode;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDupliNumber {

    public static void main(String args[]) {

        int a[] = {1, 3, 3, 4, 5, 6, 7, 7, 10};
        HashSet<Integer> arr = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) 
                {
                    arr.add(a[i]);
                }
            }

        }
        for(int x:arr)
        {
             System.out.println("Numbers are " + x);
        }
       

    }

}
