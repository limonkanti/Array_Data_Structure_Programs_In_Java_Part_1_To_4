
package ArrayProgramms;

public class Array_Find_Max_Val
{
    
    public static void main(String args[])
    {
        int ary[]={1,2,3,4,5};
        int max=ary[0];
        int k;
        for(int i=1;i<ary.length;i++)
        {
            if(max<ary[i])//ary[i]<max
      //smallest....       if(ary[i]<max)   
            {
                max=ary[i];
            }
            
            
        }
        System.out.println("Largest number of array is:\n"+max);
        
    }
    
}
