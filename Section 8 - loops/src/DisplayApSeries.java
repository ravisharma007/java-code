import java.util.*;
public class DisplayApSeries {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting number: ");
        int a=sc.nextInt();
        System.out.print("\nEnter Common Difference : ");
        int d=sc.nextInt();
        System.out.print("\nEnter the Number of times : ");
        int n=sc.nextInt();
        System.out.println();

        int ap=a;
        for(int i=0; i<n; i++)
        {
            System.out.print(ap+",");
            ap=ap+d;

        }




    }
}
