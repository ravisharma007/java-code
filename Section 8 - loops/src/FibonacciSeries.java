import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b and 'n' Number of times :");
        int a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt(),fibo=a;

        System.out.print(a + "," + b + "," );
        for(int i=0;i<n;i++)
        {
            fibo=a+b;
            System.out.print(fibo+",");
            a=b;
            b=fibo;
        }
    }
}
