
package ArrayProgramms;


public class ArrayCopyElements2 
{
     public static void main(String[] args) {
        int [] arr={1,2,34};
        int[] b=new int[arr.length];
        for(int i=0;i<b.length;i++)
        {
            b[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(b[i]);
        }
        
        b[2]=43;
        System.out.println(arr[2]);
        
        System.out.println(b[2]);
        
        arr[2]=44;
        System.out.println(b[2]);
       
    }
    
}
