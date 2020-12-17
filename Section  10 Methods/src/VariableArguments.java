import java.util.*;
public class VariableArguments {

    static int maxNo(int ...n) // Maximum of numbers
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            if (max < n[i])
            {
                max=n[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input of numbers :");
        int maximum=maxNo(10,20,30,40,50,99);
        System.out.println("Maximum is : " + maximum);
    }
}
