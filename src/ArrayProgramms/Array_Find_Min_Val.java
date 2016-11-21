
package ArrayProgramms;


public class Array_Find_Min_Val
{
    
    public static void main(String args[])
    {
        int ary[]={2,3,4,5,1};
        int max=ary[0];
        int k;
        for(int i=1;i<ary.length;i++)
        {
            if(ary[i]<max)//ary[i]<max
      //smallest....       if(ary[i]<max)   
            {
                max=ary[i];
            }
            
            
        }
        System.out.println("Smallest number of array is:\n"+max);
        
    }
    
}
