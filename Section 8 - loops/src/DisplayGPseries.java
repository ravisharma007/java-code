import java.util.*;
public class DisplayGPseries {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting number: ");
        int a=sc.nextInt();
        System.out.print("\nEnter Common ratio : ");
        int r=sc.nextInt();
        System.out.print("\nEnter the Number of times : ");
        int n=sc.nextInt();
        System.out.println();

        int gp=a;
        for(int i=0; i<n; i++)
        {
            System.out.print(gp+",");
            gp=gp*r;

        }




    }
}
