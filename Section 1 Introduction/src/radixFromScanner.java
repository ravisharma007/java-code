import java.lang.*;
import java.util.*;

public class radixFromScanner {

    public static void main(String[] args){

        System.out.println("This is the Demostration of Scanner's radix Method");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Binary Number :");
        sc.useRadix(2); //here 2 in args represent the Binary Digit it can take from keyboard
        int x=sc.nextInt();

        System.out.println( "Binary to Integer number : " + x);


    }
}
