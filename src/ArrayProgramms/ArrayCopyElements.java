
package ArrayProgramms;


public class ArrayCopyElements 
{
    
    public static void main(String[] args) {
        int [] arr={1,2,34};
        int[] b=arr;
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        b[2]=43;
        System.out.println(arr[2]);
        System.out.println(b[2]);
         for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    }
}
