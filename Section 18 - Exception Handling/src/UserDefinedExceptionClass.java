import java.lang.*;
import java.io.*;

class MinBalance extends Exception
{
    @Override
    public String toString() {
        return "Balance should not be less than 5000";
    }
}

public class UserDefinedExceptionClass {

    static void fun1()
    {
        try {
            throw new MinBalance();
        }
        catch(MinBalance a)
        {
            System.out.println(a);
        }
    }

    static void fun2()
    {
        fun1();
    }

    static void fun3()
    {
        fun2();
    }
    public static void main(String[] args)
    {
        fun3();
    }
}
