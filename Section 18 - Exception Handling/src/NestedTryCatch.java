import java.lang.*;

public class NestedTryCatch {
    public static void main(String[] args)
    {
        int A[]={40,30,20,10,0};


        try
        {
            int x= A[0]/A[4];
            System.out.println("Division is: "+ x);

            try
            {
                System.out.println(A[5]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        System.out.println("End of the program");
    }
}
