import java.lang.*;
import java.util.*;


public class areaTriangle2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float area,S,a,b,c,product;
        System.out.println("Area of Triangle Second Method1");

        System.out.println("Enter side a :");
        a=sc.nextFloat();
        System.out.println("Enter side b :");
        b=sc.nextFloat();
        System.out.println("Enter side c :");
        c=sc.nextFloat();

        S= (0.5f)*(a+b+c);
        product= S*((S-a)*(S-b)*(S-c));
        area = (float) Math.sqrt(product); //Math class present in java.lang package.

        System.out.println("Area is : " + area);

    }
}
