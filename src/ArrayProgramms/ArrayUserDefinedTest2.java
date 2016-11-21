
package ArrayProgramms;

class Test
{
    void disPlay()
    {
        System.out.println("Super Class!!!!User Defined Array");
    }
    
}
public class ArrayUserDefinedTest2 extends Test
{
    
    void disPlay()
    {
        System.out.println("Sub Class!!!!User Defined Array");
    }
    
    public static void main(String[] args) 
    {
        Test[] ob=new Test[5];
        for(int i=0;i<ob.length;i++)
        {
            ob[i]=new ArrayUserDefinedTest2();
            ob[i].disPlay();
        }
        
    }
    
}
