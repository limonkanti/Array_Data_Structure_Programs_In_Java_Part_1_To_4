
package ArrayProgrammsUsingLibrary;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test_2_array_equal_or_not
{
    public static void main(String args[])
    {
        int x[]={1,2,3};
        int y[]={1,2,33};
        System.out.println(Arrays.equals(x, y));
            
        String s1[]={"Limon"};
        String s2[]={"Limon"};
         System.out.println(Arrays.equals(s1, s2));
        
    }
    
}
