import java.lang.*;
import java.util.*;

public class ReadfromKeyboard {

    public static void main(String[] args)
    {
        System.out.println("This Program Take input from Keyboard ");
        System.out.println("Add 2 Integer Numbers:-");

        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the First number : ");
        x=sc.nextInt();
        System.out.println("Enter the Second number : ");
        y=sc.nextInt();

        int z;
        z=x+y;
        System.out.println("Total sum = " + z);
    }
}
