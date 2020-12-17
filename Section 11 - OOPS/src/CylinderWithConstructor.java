import java.lang.*;

class CylinderConstroctor
{
    private double radius;
    private double height;

    public CylinderConstroctor()
    {
        radius=1;
        height=1;
    }

    public CylinderConstroctor(double r,double h)
    {
        setHeight(h);
        setRadius(r);
    }

    public double getRadius()
    {
        return radius;
    }
    public double getHeight()
    {
        return height;
    }
    public void setRadius(double r)
    {
        if(radius >= 0)
            radius=r;
        else
            radius=0;
    }
    public void setHeight(double h)
    {
        if(height >= 0)
            height=h;
        else
            height=0;
    }
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
public class CylinderWithConstructor {
    public static void main(String[] args)
    {
        System.out.println("Cylinder class practice with Constructor : ");
        CylinderConstroctor c1=new CylinderConstroctor(3,7);


        System.out.println("Lid Area : " + c1.lidarea());
        System.out.println("Circumfrenece : " + c1.circumfrence());
        System.out.println("Total surface Area : " + c1.totalSurfaceArea());
        System.out.println("Volume : " + c1.volume());
        System.out.printf("total surface area with only 2 decimal places : %-7.2f \n",c1.totalSurfaceArea());

        System.out.println("Radius :" + c1.getRadius());
        System.out.println("Height : " + c1.getHeight());
    }
}
