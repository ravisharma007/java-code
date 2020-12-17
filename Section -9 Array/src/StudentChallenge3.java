import java.util.*;
public class StudentChallenge3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //========= Copying an Array=============//
//        int A[]={2,3,4,5,7,9};
//        int B[]=new int[A.length];
//
//        for(int i =0,j=0;i<A.length;i++,j++)
//        {
//            B[j]=A[i];
//        }
//
//        for(int i=0;i<B.length;i++)
//        {
//            System.out.print(B[i] + ",");
//        }

        // Reverse Copying an Array ==============

//        int A[]={2,3,4,5,7,9};
//        int B[]=new int[A.length];
//
//        for(int i =0,j=0;i<A.length;i++,j++)
//        {
//            B[j]=A[i];
//        }
//
//        for(int i=B.length-1,j=0;i>=0;i--,j++)
//        {
//            A[j]=B[i];
//        }
//
//        for(int i=0;i<A.length;i++)
//        {
//            System.out.print(A[i] + ",");
//        }

        //======= Increse Size of Array=================

        int A[]={2,3,4,5,7,9};
        System.out.println("Enter the New Size of array: ");
        int size=sc.nextInt();
        int B[]=new int[size];

        for(int i =0,j=0;i<A.length;i++,j++)
        {
            B[j]=A[i];
        }

        A=B;
        B=null;

        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + ",");
        }
    }
}
