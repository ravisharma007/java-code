import java.lang.*;

class RectangleConstructor
{
    private double length;
    private double breadth;

    public RectangleConstructor()
    {
        length=1;
        breadth=1;
    }

    public RectangleConstructor(double l, double b)
    {
        setLength(l);
        setBreadth(b);
    }

    public RectangleConstructor(double s)
    {
        if(s >=0)
            length=breadth=s;
        else
            length=breadth=0;
    }
    public double getLenghth()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    {
        if(l>=0)
            length=l;
        else
            length=0;
    }
    public void setBreadth(double b)
    {
        if(b >=0)
            breadth=b;
        else
            breadth=0;
    }
    public double area()
    {
        return length*breadth;
    }

    public double parameter()
    {
        return 2*(length+breadth);
    }

    public boolean issquare()
    {
        if(length == breadth)
        {
            return true;
        }
        else
            return false;
    }
}
public class RectangleWithConstructor {

    public static void main(String[] args)
    {
        System.out.println("Rectangle example with Different types of constructors : ");
        RectangleConstructor r1=new RectangleConstructor(9,7);

        System.out.println("Area : " + r1.area());
        System.out.println("Length : " + r1.getLenghth());
        System.out.println("Length : " + r1.getBreadth());
    }
}
