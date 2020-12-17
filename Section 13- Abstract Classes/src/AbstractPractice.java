import java.lang.*;

public class AbstractPractice {
    public static void main(String[] args)
    {
        Super s1=new Sub();

        s1.meth1();
    }
}

abstract class Super
{
    Super()
    {
        System.out.println("Constructor of super");
    }

    abstract public void meth1();
}

class Sub extends Super
{
    public void meth1()
    {
        System.out.println("overriden meth1");
    }
}