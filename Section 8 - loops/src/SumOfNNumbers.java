import java.util.*;
public class SumOfNNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sum of n Number Program:");
        int x=sc.nextInt();
        int sum=0;

        for(int i=1;i<=x;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sun of n numbers are: " + sum);
    }
}
