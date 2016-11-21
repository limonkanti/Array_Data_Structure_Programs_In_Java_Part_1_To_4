
package ArrayProgramms;

public class Array_Reverse2
{
    public static void main(String args[]) {
        System.out.println("Please Enter the length");
        // Scanner sc = new Scanner(System.in);
        int a[]={10,20,30,40,50};
        System.out.println("Reverse of the array is:\n");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+"\t");
        }
        

    }
    
}
