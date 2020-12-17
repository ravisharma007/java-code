import java.util.*;
public class revreseIntArray {
    static int revrse(int n)
    {
        int remainder=0,rev=0;
        while(n>0)
        {
            remainder=n%10;
            n=n/10;
            rev= (rev * 10) + remainder;
        }
        return rev;
    }

    static void reverse(int A[])
    {
        int B[]=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        for(int i=B.length-1,j=0;i>=0;i--,j++)
        {
            A[j]=B[i];
        }
    }

    static void createArray(int A[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Values In Array : ");
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
    }

    static void Display(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + ",");
        }
        System.out.println("");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int rev=revrse(num);
        System.out.println(rev);

        System.out.println("Enter the Size of an array : ");
        int A[]=new int[sc.nextInt()];
        createArray(A);
        reverse(A);
        System.out.println("Reversed array : ");
        Display(A);
    }

}
