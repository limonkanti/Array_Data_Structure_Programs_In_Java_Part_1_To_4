package ArrayJavatpoint;

import java.util.Arrays;

public class Sort_SearchIndexArray {

    public static void main(String args[]) {
        int ar[] = {3, 5, 2, 6, 1};
        System.out.println("Before Sort!!!!");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);

        }
        Arrays.sort(ar);
        System.out.println("After Sort!!!!");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);

        }
        int pos = Arrays.binarySearch(ar, 5);
        if (pos > 0) {
            System.out.println("Position is" + pos);
        } else {
            System.out.println("Not found...");
        }

    }

}
