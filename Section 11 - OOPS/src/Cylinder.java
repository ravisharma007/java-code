import java.lang.*;

class CylinderMethod
{
    public double radius;
    public double height;

    public double lidarea()
    {
        return Math.PI*radius*radius;
    }

    public double circumfrence()
    {
        return 2*(Math.PI)*radius;
    }

    public double totalSurfaceArea()
    {
        return 2*Math.PI*radius*(radius+height);
    }

    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
}
public class Cylinder {
    public static void main(String[] args)
    {
        System.out.println("Cylinder class practice : ");
        CylinderMethod c1=new CylinderMethod();
        c1.radius = 7;
        c1.height = 10;

        System.out.println("Lid Area : " + c1.lidarea());
        System.out.println("Circumfrenece : " + c1.circumfrence());
        System.out.println("Total surface Area : " + c1.totalSurfaceArea());
        System.out.println("Volume : " + c1.volume());
        System.out.printf("total surface area with only 2 decimal places : %-7.2f ",c1.totalSurfaceArea());
    }
}
