import java.lang.*;
import java.util.*;

public class calculateArea {
    public static void main(String[] args){
        float height;
        float base;
        float area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Programme to Calculate the Area of an Triangle");
        System.out.println("Enter the Height of the Triangle");
        height = sc.nextFloat();
        System.out.println("Enter the Base of the Triangle");
        base = sc.nextFloat();
        area =(0.5f)*(base*height);
        System.out.println("Area of Triangle is : " + area);

    }
}
