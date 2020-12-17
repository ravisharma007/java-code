import java.util.*;

public class SumOfAllElements {
    static int sumOfAllElements(int ...n)
    {
        int sum=0;
        for(int i=0; i<n.length;i++)
        {
            sum=sum+n[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input of numbers :");
        int sumCalling=sumOfAllElements(10,20,30,40,50,99);
        System.out.println("Sum  is : " + sumCalling);
    }
}
