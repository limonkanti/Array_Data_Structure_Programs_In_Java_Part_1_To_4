

package ArrayProgramms;


public class Array_Swaping_2_array
{
     public static void main(String args[]) 
     {
        int ary[] = {4, 60, 3, 1, 5};
        int ary2[]={6,7,8,0,2};
        int ary3[]=new int[10];
        int temp;
       System.out.println("Swapping Technique");
        for(int i=0;i<5;i++)
        {
            temp=ary[i];
            ary[i]=ary2[i];
            ary2[i]=temp;
        }
        System.out.println("After Swapping ary is");
        for(int i=0;i<5;i++)
        {
            System.out.println(ary[i]);
        }
        System.out.println("After Swapping ary2 is");
       for(int i=0;i<5;i++)
        {
            System.out.println(ary2[i]);
        }

    }
    
}
