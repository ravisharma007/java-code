import java.lang.*;

class Outer
{
    static int x=10;
    int y=20;

    void show()
    {
        System.out.println(x+" "+y);
    }

    static void display()
    {
        System.out.println(x);
    }
}
public class StaticPractice {
    public static void main(String[] args)
    {
        Outer.display();
        Outer obj=new Outer();
        obj.show();
        obj.display();
        obj.x=30;
        obj.y=50;

        Outer obj2=new Outer();
        obj2.display();
        obj2.show();
    }
}
