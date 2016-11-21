
package ArrayProgramms;

public class Array_in_method 
{
    
    void traversing(int a[])
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i]+"\t");
            
        }
        
        
    }
    public static void main(String args[])
    {
        Array_in_method ob=new Array_in_method();
       int b[]={1,2,3};
       ob.traversing(b);
     
       
       
        
    }
    
}
