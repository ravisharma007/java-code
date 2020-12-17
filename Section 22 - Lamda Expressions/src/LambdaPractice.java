import java.lang.*;

@FunctionalInterface
interface MyLambda
{
    public void display();
}

class UseLambda
{
    public void callLambda(MyLambda ml)
    {
        ml.display();
    }
}

class Demo
{
    public void passing()
    {
        UseLambda c1=new UseLambda();
        c1.callLambda(()->System.out.println("hello"));
    }
}
public class LambdaPractice {
    public static void main(String[] args)
    {
        Demo d1=new Demo();
        d1.passing();
    }
}
