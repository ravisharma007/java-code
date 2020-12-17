import java.lang.*;

public class InterfacePractice {
    public static void main(String[] args)
    {
        Test obj1=new Sub();

        obj1.meth1();
        obj1.meth2();
    }

}

// interface body
interface Test
{
    void meth1();
    void meth2();
}

//Implements and overriding Interface with sub-class
class Sub implements Test
{
    public void meth1()
    {
        System.out.println("Meth1 of sub class");
    }

    public void meth2()
    {
        System.out.println("meth2 of sub class");
    }
}


