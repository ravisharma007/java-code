import java.util.*;
public class Factorial {
    public static void main(String[] args)
    {
        System.out.println("Factorial of a no.");
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int fact=1;
        for(int i=x;i>0;i--)
        {
            fact=fact*i;
        }
        System.out.println("Fatorial of "+x+" is: " + fact);
    }
}
