import java.util.*;
public class StudentChallenge2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Find what Radix it is :");
        System.out.println("Enter the Radix : ");
        String number=sc.next();

        if(number.matches("[01]+"))
        {
            System.out.println("Radix is Binary");
        }
        else if(number.matches("[0-7]+"))
        {
            System.out.println("Radix is Octal");
        }
        else if(number.matches("[0-9]+"))
        {
            System.out.println("Radix is Decimal");
        }
        else if(number.matches("[0-9A-F]+"))
        {
            System.out.println("Radix is Hexa-Decimal");
        }
    }
}
