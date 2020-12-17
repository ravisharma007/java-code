import java.util.*;
public class MaxInArray {
    static int maxArray(int A[])
    {
        int x=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(x<A[i])
            {
                x=A[i];
            }
        }
        return x;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int A[]={2,4,6,12,18,5};
        int max=maxArray(A);
        System.out.println("Maximum is : " + max);

    }
}
