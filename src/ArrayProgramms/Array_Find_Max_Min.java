
package ArrayProgramms;

public class Array_Find_Max_Min 
{
    public static void main(String args[])
    {
        int ary[]={1,2,3,4,5};
        int max=ary[0];
        int min=ary[0];
        int k;
        for(int i=1;i<ary.length;i++)
        {
            if(max<ary[i])
            {
                max=ary[i];
            }
            if(ary[i]<min)
            {
                min=ary[i];
            }
            
            
        }
        System.out.println("Largest number of array is:\n"+max);
        System.out.println("Smallest number of the array is:\n"+min);
        
    }
    
}
