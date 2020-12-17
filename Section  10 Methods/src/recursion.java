import java.lang.*;
import java.util.*;

public class recursion {

    static void display(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            display(n-1);
        }
    }
    public static void main(String[] args)
    {
        //recursive method for printing
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the value : ");
        int x=sc.nextInt();
        display(x);
    }

}
