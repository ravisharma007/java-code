import java.lang.*;

public class OverridingPractice {
    public static void main(String[] args)
    {
        Child c1 = new Child();
        c1.Display();

        Parent p1= new Child(); // Dynamic Method Dispatch
        p1.Display();
    }
}

class Parent
{
    double x;

    Parent()
    {
        System.out.println("Parent constructor");
    }

    void Display()
    {
        System.out.println("Hello parent");
    }
}

class Child extends Parent
{
    double x;

    Child()
    {
        System.out.println("Child constructor");
    }

    void Display()
    {
        System.out.println("Hello child");
    }
}
