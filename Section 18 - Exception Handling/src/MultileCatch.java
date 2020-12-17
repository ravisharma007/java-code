import java.lang.*;

public class MultileCatch {
    public static void main(String[] args)
    {
        int A[]={50,20,30,20,10,0};
        int x;

        try {
            x = A[0] / A[5];
            System.out.println("Division is: " + x);

            System.out.println(A[4]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0,try again " + e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index " + e);
        }

        System.out.println("End of the program");
    }
}
