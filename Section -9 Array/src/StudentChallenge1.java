import java.util.Arrays;

public class StudentChallenge1 {
    public static void main(String[] args)
    {
        //=====Finding sum of all elements========
        int A[]={2,4,6,8,10,15,17,19,18};
        int sum=0;
        for(int i=0; i<A.length;i++)
        {
            sum=sum+A[i];
        }
        System.out.println("Sum of all elements : "+ sum);

        //===== Searching an element========
        int key=6;
        for(int j=0;j<A.length;j++)
        {
            if(A[j]==key)
            {
                System.out.println("Key found at Index : "+ j);
                break;
            }
        }

        //======== Finding maximum elements=========
        int max= Integer.MIN_VALUE;
        for(int k=0;k<A.length;k++)
        {
            if(max<A[k])
            {
                max=A[k];
            }
        }
        System.out.println("Max is: " + max);

        //========= Finding Second Largest element =========

        int max1=A[0],max2=A[0];
        for(int l=0;l<A.length;l++)
        {
            if(max1<A[l])
            {
                max2=max1;
                max1=A[l];
            }
            else if(max1>A[l] && max2<A[l])
            {
                max2=A[l];
            }
        }
        System.out.println("Second Largest element: "+ max2);


    }

}

