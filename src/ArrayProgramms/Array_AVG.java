

package ArrayProgramms;

public class Array_AVG
{
    
    
    public static void main(String args[])
    {
        
        int a[]={1,2,3,4,5};
        int result=0;
        for(int i=0;i<a.length;i++)
        {
                result=result+a[i];  
        }
        System.out.println("Average is:\n"+result/a.length);
        
    }
}
