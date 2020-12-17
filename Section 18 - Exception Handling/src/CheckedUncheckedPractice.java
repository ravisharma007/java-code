import java.lang.*;
import java.io.*;

public class CheckedUncheckedPractice {

    public static void fun1()
    {
        try {
            System.out.println(10 / 0);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void fun2()
    {
        fun1();
    }

    public static void main(String[] args)
    {
        fun2();
    }
}
