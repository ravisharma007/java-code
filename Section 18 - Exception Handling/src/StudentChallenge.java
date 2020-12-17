import java.lang.*;

class StackOverflow extends Exception
{
    public String toString()
    {
        return "Stack is Full";
    }
}
class StackUnderflow extends Exception
{
    public String toString()
    {
        return "Stack is Empty";
    }
}

class Stack
{
    public int size;
    public int top;
    public int st[];

    public Stack(int size)
    {
        this.size=size;
        top=-1;
        st = new int[size];
    }
    public void push(int x) throws StackOverflow
    {
        if(top == size-1)
            throw new StackOverflow();
        top++;
        st[top]=x;
    }

    public int pop() throws StackUnderflow
    {
        int x=-1;
        if(top == -1)
            throw new StackUnderflow();
        x=st[top];
        top--;
        return x;
    }

}
public class StudentChallenge {
    public static void main(String[] args)
    {
        Stack s1=new Stack(5);

        try {
            s1.push(2);
            s1.push(3);
            s1.push(2);
            s1.push(3);
            s1.push(2);
            s1.push(3);
        }
        catch (StackOverflow e)
        {
            System.out.println(e);
        }


    }
}
