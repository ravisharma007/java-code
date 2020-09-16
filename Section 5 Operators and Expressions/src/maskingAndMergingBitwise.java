import java.lang.*;
import java.util.*;

public class maskingAndMergingBitwise {
    public static void main(String[] args)
    {
        byte x=9,y=12;
        byte c;
        // Masking operations:
        c= (byte) (x<<4);
        c= (byte) (c|y);

        
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));

    }
}
