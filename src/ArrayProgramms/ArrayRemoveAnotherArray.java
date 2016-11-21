
package ArrayProgramms;

import java.util.*;


public class ArrayRemoveAnotherArray 
{
    public static void main(String[] args) 
    {
        ArrayList al=new ArrayList();
        al.add(1);
        al.add(11);
        al.add(111);
        al.add(1111);
        System.out.println("Before Remove\t"+al);
        ArrayList al2=new ArrayList();
        al2.add(1111);
        al2.add(11);
        al2.add(222);
        al2.add(2222);
        al.removeAll(al2);
        System.out.println("After Remove\t"+al);
    }
    
}
