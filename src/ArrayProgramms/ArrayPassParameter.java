
package ArrayProgramms;


public class ArrayPassParameter
{
    
    public void disPlay(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]+1);
        }
        
    }
    public static void main(String[] args) 
    {
        int ar[]=new int[5];
        ArrayPassParameter ob=new ArrayPassParameter();
        ob.disPlay(ar);
        
        
    }
}
