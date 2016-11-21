package ArrayProgramms;

import java.util.Arrays;

public class Insert {

    public static void main(String args[]) {
        int ar[] = {1, 2, 4, 5, 6};
        int n=ar.length;
        int i;
        int position = 1;
        int item = 3;
       for(i=ar.length-1;i>position;i--)
       {
           ar[i]=ar[i-1];
       }
        
      ar[position]=item;
       
       
            System.out.println(Arrays.toString(ar));
       
    }
}
