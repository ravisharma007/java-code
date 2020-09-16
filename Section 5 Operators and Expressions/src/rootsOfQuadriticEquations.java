import java.lang.*;
import java.util.*;

public class rootsOfQuadriticEquations {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Roots of Quadratic Equation Programme");

        float a,b,c,r1,r2,D;
        System.out.println("Enter value of a, b, c");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();

        D=(float)Math.sqrt((b*b)-(4*a*c));
        r1= ((-b)+D)/(2*a);
        r2 = ((-b)-D)/(2*a);

        System.out.println("root 1 : " + r1);
        System.out.println("root 1 : " + r2);
    }
}
