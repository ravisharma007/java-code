import java.lang.*;

public class swappingBit {
    public static void main(String[] args)
    {
        int x=9,y=12;

        x=x^y;
        y=x^y;
        x=x^y;

        System.out.println("x: " + x +" \n" +"y: " + y);
    }
}
