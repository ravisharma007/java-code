import java.util.*;

public class StudentChallengePrimeNumber
{
    static boolean checkPrime(int n)
    {
        int half=n/2;
        for(int i=2;i<=half;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println("Is Number Prime = " + checkPrime(n));
    }

}
