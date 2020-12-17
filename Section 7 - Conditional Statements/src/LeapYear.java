import java.sql.SQLOutput;
import java.util.*;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year=sc.nextInt();

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("Year is a Leap Year");
                }
                else
                {
                    System.out.println("Year is Not a Leap Year");
                }
            }
            else
            {
                System.out.println("Year is Leap Year");
            }
        }
        else
        {
            System.out.println("Year is Not a Leap Year");
        }
    }
}
