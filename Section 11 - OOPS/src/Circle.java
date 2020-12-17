import java.lang.*;

class CircleActualClass
{
    double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double parameter()
    {
        return 2*Math.PI*radius;
    }

    public double circumfrence()
    {
        return parameter();
    }
}

public class Circle {
    public static void main(String[] args)
    {
        System.out.println("Circle : ");
        CircleActualClass c1 = new CircleActualClass(); //object created
        c1.radius=7;

        System.out.println("Area : " + c1.area());
        System.out.println("Parameter : " + c1.parameter());
        System.out.println("Circumfrence : " + c1.circumfrence());

    }
}
