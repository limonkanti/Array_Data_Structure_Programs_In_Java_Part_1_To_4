
package ArrayProgramms;


public class ArrayJagged_RaggedTest 
{
    
    public static void main(String[] args) {
        int ar[]={1,2,3};
        int ar2[]={4,5,6};
        int ar3[][]={ar,ar2};
        for(int i=0;i<2;i++)
        {
             for(int j=0;j<3;j++)
             {
                 System.out.print(ar3[i][j]);
             }
             System.out.println();
        }
        
        
    }
}
