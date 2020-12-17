import java.lang.*;

class RectangleMethod
{
    //public double length;
    //public double breadth;

    private double length;
    private double breadth;

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

public class Rectangle {
    public static void main(String[] args)
    {
        System.out.println("Rectangle class practice :");
        RectangleMethod r1=new RectangleMethod();
        r1.setLength(-9);
        r1.setBreadth(9);

        System.out.println("Area : " + r1.area());
        System.out.println("Parameter : " + r1.parameter());
        System.out.println("Is rectangle is square : " + r1.issquare());

        System.out.println("Length : " + r1.getLenghth());
        System.out.println("Breadth : " + r1.getBreadth());
    }
}
