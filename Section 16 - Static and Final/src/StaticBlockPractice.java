import java.lang.*;


public class StaticBlockPractice {
    static
    {
        System.out.println("Block 1");
    }

    public static void main(String[] args)
    {
        System.out.println("Main");
    }

    static
    {
        System.out.println("Block 2");
    }
}
