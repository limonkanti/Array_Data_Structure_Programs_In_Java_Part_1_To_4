package ArrayProgramms;

public class Array_Find_2nd_Max_Val {

    public static void main(String args[]) {
        int ary[] = {4, 60, 3, 1, 5};
        int min1=0;
       
        int min2=0;
      
        for(int i:ary)
        
            if(i>=min1)
            {
               
                 min2=min1;
                 min1=i;
                 
                
            }
            else if(i>=min2)
            {
                min2=i;
                
            }
            
          System.out.println("The Second Largest Element is\t:"+min2 );  
        
        
        
       

    }
}
