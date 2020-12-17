import java.lang.*;

public class ShapePractice {
    public static void main(String[] args)
    {
        Circle c1=new Circle(5);
        Rectangle r1=new Rectangle(6,8);

        System.out.println(c1.perimeter());
        System.out.println(c1.area());

        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}

abstract class Shape
{
    abstract double perimeter();
    abstract double area();
}

 class Circle extends Shape {
     double radius;

     Circle(double r)
     {
         radius=r;
     }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    public double area()
    {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape
{
    double length;
    double breadth;

    Rectangle(double l, double b)
    {
        length=l;
        breadth=b;
    }

    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}