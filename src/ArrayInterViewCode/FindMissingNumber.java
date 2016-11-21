package ArrayInterViewCode;

import java.util.ArrayList;

public class FindMissingNumber {

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int a[] = {1, 3, 4, 5, 6, 7, 10};
        int j = a[0];
        for (int i = 0; i < a.length; i++) {
            if (j == a[i]) {
                j++;
                continue;
            } else {
                arr.add(j);
                i--;
                j++;
            }
        }
        System.out.println("missing numbers are ");
        for (int r : arr) {
            System.out.println(" " + r);
        }
    }

}
