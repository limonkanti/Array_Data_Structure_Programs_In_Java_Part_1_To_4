package Stack_Queue_Dque_Priorityqueue;

import java.util.Scanner;

public class StackImplementation {

   private int n = 10, s, top;
   private int stack_array[];

    public StackImplementation(int i) {
       s = i;
        stack_array = new int[s];
       this.top=-1;

    }

    public void push(int j) throws Exception {
        if (this.isFull()) {
            throw new Exception("Stack is Overfollow!!!");
        } else {
            System.out.println(j);
            this.stack_array[++top] = j;
        }

    }

    public int pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is Underfollow!!!");
        }
        int entry = stack_array[top--];
        System.out.println(entry);
        return entry;
    }

    public int peek() {
        return stack_array[top];
    
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == s - 1);
    }

    public static void main(String args[]) {
        StackImplementation ob = new StackImplementation(3);
        try {
            ob.push(10);
            ob.push(20);
             ob.pop();
            ob.push(30);
           
            ob.push(40);
            ob.push(50);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try
        {
            ob.pop();
          //  ob.pop();
       //     ob.pop();
        //    ob.pop();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("The top value is:\t"+ob.peek());
    }

}
