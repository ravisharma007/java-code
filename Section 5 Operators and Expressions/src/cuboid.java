import java.lang.*;
import java.util.*;

public class cuboid {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuboid Total Area And Volume");
        System.out.println("Enter length, breadth, height");
        int length,breadth,height,TotalArea,Volume;
        int front$Back,top$Bottom,left$Right;
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();

        front$Back= length*height;
        left$Right= breadth*height;
        top$Bottom = length*breadth;

        TotalArea = (2*front$Back)+(2*left$Right)+(2*top$Bottom);
        Volume= length*breadth*height;

        System.out.println(" Total area : " + TotalArea);
        System.out.println("Volume : " + Volume);

    }
}
