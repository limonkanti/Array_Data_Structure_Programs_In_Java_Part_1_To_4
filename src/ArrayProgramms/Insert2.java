package ArrayProgramms;

import java.util.Arrays;

public class Insert2 {

    public static void main(String args[]) {
        int ar[] = {1, 2, 4, 5, 6};
        int i=ar.length-1;
        int k=2; 
        int n=ar.length;
        while(k<=i)
        {
            ar[i+1]=ar[i];
            i--;
            
        }
        ar[k]=3;
        n++;
        System.out.println(Arrays.toString(ar));
    }

}
