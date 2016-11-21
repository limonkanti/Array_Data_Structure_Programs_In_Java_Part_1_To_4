
package ArrayProgramms;


public class ArrayNegativeSize 
{
    public static void main(String[] args) 
    {
        int ar[]=new int[-5];
        ar[-1]=10;
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
       /* int[] i = new int[1+1];    //Array size can be an expression resulting an integer
        System.out.println(i[0]);

       int[] i1 = new int[(byte)10]; 
        System.out.println(i1[1]);*/
        
        Object[] o=new Integer[4];
        int ii[]={1,2};
        int i3[];
        i3=new int[]{33,3,3,3};
        
        
    }
    
}
