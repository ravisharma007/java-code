import java.lang.*;
import java.util.*;
//package arithmetic;

public class ArithmaticOperators {

    public static void main(String[] args)
    {
        int a = 35, b= 4;
        int c = a/b;
        int z = a%b;
        System.out.println(c);
        System.out.println(z);
        //========================Float==================

        float x=45.34f, y= 5.2f;
        float v= x/y;
        float n= x%y;
        System.out.println(v);
        System.out.println(n);

        //========== Coersion : Implicit type conversion=======
        
        byte o=23;
        short p=44;
        int l= (o+p);
        System.out.println(l);
    }
}
