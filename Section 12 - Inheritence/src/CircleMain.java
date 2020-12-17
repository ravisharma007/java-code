import java.lang.*;

public class CircleMain {
    public static void main(String[] args)
    {
        System.out.println("Circle and Cylinder Inheritance Practice :");
        Cylinder cyl1=new Cylinder();
        cyl1.radius=5;
        cyl1.height=7;

        System.out.println("Volume : "+ cyl1.volume());
        System.out.println("Area : "+ cyl1.area());
    }
}

class Circle
{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double parameter()
    {
        return 2*Math.PI*radius;
    }
}

class Cylinder extends Circle
{
    public double height;

    public double volume()
    {
        return area()*height;
    }
}
