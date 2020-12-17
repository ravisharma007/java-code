import java.lang.*;
import java.util.*;

public class PracticeTryCatch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two values : ");
        int a,b,c;
        a= sc.nextInt();;
        b=sc.nextInt();

        try
        {
            c=a/b;
            System.out.println("Divesion : " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0,try again " + e);
        }

        System.out.println("End of the program");

    }
}
