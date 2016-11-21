
package ArrayProgramms;


public class ArraySorting 
{
    public static void main(String[] args)
    {
        int ar[]={9,4,2,3,8,7,1};
        int i=0,j=0;
        System.out.println("Before Sorting");
        for(i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+"\t");
        }
        System.out.println();
        for(i=0;i<ar.length;i++)
        {
            for(j=i+1;j<ar.length;j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                    
                }
            }
        }
        
        System.out.println("After Sorting");
        for(i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+"\t");
        }
        System.out.println();
        
    }
    
}
