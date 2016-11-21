
package ArrayProgramms;


public class ArrayPassParameterReturn 
{
    
    public static int[] display()
    {
        int ar[]=new int[5];
        ar[2]=2;
        ar[4]=4;
        return ar;
        
    }
    public static void main(String[] args) 
    {
        int ar[]=display();
        System.out.println(ar[2]);
        System.out.println(ar[3]);
        ArrayPassParameterReturn ob=new ArrayPassParameterReturn();
        
        
        
    }
    
}
