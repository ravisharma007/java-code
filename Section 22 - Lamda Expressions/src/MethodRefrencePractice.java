import java.lang.*;

@FunctionalInterface
interface ILambda
{
    public void display(String str);
}

class TestLambda
{
   /* public void method1()
    {
        ILambda ml=System.out::println;
        ml.display("hello");
    } */

    /* public static void reverse(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public void method3()
    {
        ILambda il=TestLambda::reverse;
        il.display("hello");
    } */

    /* public void reverse(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public void method4()
    {
        TestLambda t=new TestLambda();
        ILambda il2=t::reverse;
        il2.display("hello");
    } */

    public TestLambda(String s)
    {
        System.out.println(s.toUpperCase());
    }
    public void method5()
    {
        ILambda il=TestLambda::new;
        il.display("hello");
    }
}
public class MethodRefrencePractice {
    public static void main(String[] args)
    {
        //TestLambda tl=new TestLambda();
        //tl.method1();

        /*TestLambda t2=new TestLambda();
        t2.method3(); */

        /* TestLambda t3=new TestLambda();
        t3.method4(); */

        TestLambda tl=new TestLambda("hello");
        tl.method5();


    }
}
