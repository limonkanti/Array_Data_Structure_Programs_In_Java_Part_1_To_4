
package ArrayProgramms;

class T
{
    int k=10;
    void disPlay()
    {
        System.out.println(k);
    }
}
public class ArrayReferenceDerivedTypeData 
{
    public static void main(String[] args) 
    {
        T[] ar=new T[5];
        ar[2]=new T();
        ar[3]=new T();
        for(int i=0;i<ar.length;i++)
        {
            ar[i].disPlay();
        }
        
        
        
    }
    
}
