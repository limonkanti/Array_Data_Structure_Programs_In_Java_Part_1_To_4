
package ArrayProgramms;


public class ArrayUserDefinedTest 
{
    public static void disPlay()
    {
        System.out.println("User Defined Array");
    }
    public static void main(String[] args)
    {
        ArrayUserDefinedTest ob[]=new ArrayUserDefinedTest[5];
     //   ob[0].disPlay();
        for(int i=0;i<ob.length;i++)
        {
            ob[i].disPlay();
        }
        
        
        
    }
    
}
