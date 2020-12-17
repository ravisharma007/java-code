import java.lang.*;

public class FinallyPractice {

    static void meth1() throws Exception
    {
        try {
            throw new Exception();
        }
        finally {
            System.out.println("Final Mssg");
        }
    }
    public static void main(String[] args) throws Exception
    {
        meth1();
    }
}
