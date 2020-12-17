import java.lang.*;

public class SuperTest {
    public static void main(String[] args)
    {
        System.out.println("Parameterized Constructor in Inheritance :");
        Cuboid c1=new Cuboid(5,3,7);

        System.out.println(c1.areaOfCuboid());
    }
}

class Rectangle
{
    public int length;
    public int breadth;

    public Rectangle()
    {
        length=breadth=1;
    }

    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public int area()
    {
        return length*breadth;
    }
}

class Cuboid extends Rectangle
{
    public int height;

    public Cuboid()
    {
        height=1;
    }
    public Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }

    public int areaOfCuboid()
    {
        return area()*height;
    }
}
