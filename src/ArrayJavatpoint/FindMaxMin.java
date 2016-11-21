package ArrayJavatpoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxMin {

    public static void main(String args[]) {
        int ar[] = {1, 2, 3, 7, 8, 9};

        List<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < ar.length; i++) {
            al.add(ar[i]);
        }
        Collections.sort(al);

        List<Integer> a2 = new ArrayList<Integer>();
        List<Integer> a3 = new ArrayList<Integer>();
        a2.add(Collections.max(al));
        System.out.println("First Max is:\t" + a2);
        al.remove(Collections.max(al));
        a3.add(Collections.max(al));
        System.out.println("Second Max is:\t" + a3);

    }

}
